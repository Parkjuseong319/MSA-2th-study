package quiz.Interface;

public class TransMain {
	public static void main(String[] args) {
		Trans t = new Subway();
		t.start();
		t.stop();
		System.out.println("======================");
		
		t = new Bus();
		t.start();
		t.stop();
		System.out.println("======================");
		
		t = new Bicycle();
		t.start();
		t.stop();
		System.out.println("======================");
		
		t = new Plane();
		t.start();
		t.stop();
	}

}
