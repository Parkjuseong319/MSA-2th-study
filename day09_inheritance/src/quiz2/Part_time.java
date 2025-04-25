package quiz2;

public class Part_time extends Employee{
	int pay;
	
	public Part_time(String name, int no, String number, String part, int day) {
		this.name = name;
		this.no = no;
		this.number = number;
		this.part = part;
		this.role = "Part-Time";
		pay = day * 10030;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("급여: " + pay);
	}
	
	
}
