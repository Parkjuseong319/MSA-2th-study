package ex05.inheritance;

public class Rectangle extends Point{
	private int x2, y2;
	
	public Rectangle() {
		x2= 15; y2=15;
		System.out.println("Rectangle class constructor");
	}
	public Rectangle(int x2) {
		this.x2 = x2;
		System.out.println("Rectangle class 1 constructor");
	}
	public Rectangle(int x2, int y2) {
		this.x2 = x2;
		this.y2 = y2;
		System.out.println("Rectangle class 2 constructor");
	}
	
	public void disp() {
		System.out.println(x + ", " + y + "\n" + x2 + ", " + y2);
	}
}
