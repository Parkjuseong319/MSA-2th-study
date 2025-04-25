package quiz.Abstract;

public class MainEntry {
	public static void main(String[] args) {
		Trans[] t = new Trans[4];
		t[0] = new Subway();
		t[1] = new Bus();
		t[2] = new Bicycle();
		t[3] = new Plane();
		
		String[] names = {"Subway", "Bus", "Bicycle", "Plane"};
		
		for (int i = 0; i < t.length; i++) {
			t[i].show(names[i]);
			t[i].start();
			t[i].stop();
			System.out.println("===========================");
		}
	}
}
