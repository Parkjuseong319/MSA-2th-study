package ex05.inheritance;

public class InheritanceMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.disp();
		
		
		Circle c = new Circle();	// 객체생성, 메모리에 할당, 생성자함수 자동호출
		c.disp();
		
		Circle c2 = new Circle(50);	// 객체생성, 메모리에 할당, 생성자함수 자동호출
		c2.disp();
		
		
	}
}
