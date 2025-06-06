package ex01.Abstract;

abstract class Shape{	// abstract class, Super class
	double result = 0;
	public abstract double calc();
	public abstract void draw();
	
	public void show() {
		System.out.println("Super class Shape call");
	}
	
} // Shape end

class Circle extends Shape{		// Sub class
	
	double r = 5.0;

	@Override
	public double calc() {
		result = r * r * Math.PI;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("원의 넓이: " + result + "인 원을 그렸습니다.");
		
	}
}	// Circle

// Rect class --> Shape
class Rectangle extends Shape{
	int w = 5;
	int h = 5;

	@Override
	public double calc() {
		result = w * h;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("사각형의 넓이: " + result + "인 사각형을 그렸습니다.");
	}
	
}
// triangle 구현하기



public class MainEntry {
	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.draw();
		
		Rectangle r = new Rectangle();
		r.draw();
		
		Shape sh = new Circle();
		sh.draw();
		
		sh = new Rectangle();
		sh.draw();
//		Shape sh = new Shape();		// 추상 클래스는 객체 생성 불가능하다.
//		Shape sh = new Circle();	// 상속 받은 클래스로 객체 생성 할 수 있다.
	}
}
