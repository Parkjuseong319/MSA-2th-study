package ex01.annot.java;

import lombok.AllArgsConstructor;

@AllArgsConstructor		// DI
public class Cats {
	private MyCats myCats;	// has-a

	public void setMyCats(MyCats myCats) {		// DI
		this.myCats = myCats;
	}
	
	public void getMyCatsInfo() {
		System.out.println("=============================");
		System.out.println("Cats Name: " + myCats.getName());
		System.out.println("Cats age: " + myCats.getAge());
		System.out.println("Cats Hobby: " + myCats.getHobbys());
		System.out.println("Cats Weihgt: " + myCats.getWeight());
		System.out.println("Cats Color: " + myCats.getColor());
		System.out.println("=============================");
	}
	
}
