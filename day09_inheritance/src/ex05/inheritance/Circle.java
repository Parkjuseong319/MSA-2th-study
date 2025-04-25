package ex05.inheritance;

public class Circle extends Point {
	private int r;
	
	public Circle(int r) {
		super(5, 7); 	// 반드시 첫줄에 위치
		this.r = r;
		System.out.println("Circle class 1 constructor");
	}
	public Circle(int x, int y) {
		x = y = 999;
		System.out.println("Circle class 2 constructor");
	}
	public Circle() {
		r = 5;
		System.out.println("Circle class constructor");
	}
	
	public void disp() {
		super.disp();
		System.out.print(", " + r);
	}
}
