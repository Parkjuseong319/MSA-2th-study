package ex01.oop;

public class Point {
	private int x, y;
	
	public Point() {
		this(100, 100);		// 첫줄에 위치해야한다.
		System.out.println("default constructor");
//		x = y = 100;
	}
	public Point(int xx) {
		this.x = xx;
		y = 30;
		System.out.println("1 constructor");
	}
	public Point(int xx, int yy) {
		this.x = xx;
		this.y = yy;
		System.out.println("2 constructor");
	}
	
	//output method
	public void disp() {
		System.out.println(x + ", " + y);
	}
}
