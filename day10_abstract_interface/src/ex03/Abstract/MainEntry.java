package ex03.Abstract;

public class MainEntry {
	public static void main(String[] args) {
		// 3. 배열을 이용한 형태
		Shape[] s = new Shape[3];	// 배열 선언 및 생성
		s[0] = new Circle();
		s[1] = new Rect();
		s[2] = new Triangle();
		
		String[] names = {"Circle", "Rectangle", "Triangle"};
		
		for (int i = 0; i < s.length; i++) {
			s[i].show(names[i]);
		}
		
		
		// 2. Shape 부모 추상 클래스를 이용해서 객체 생성
		System.out.println("============================");
		Shape sh = new Circle();
		sh.show("Circle");
		
		sh = new Rect();
		sh.show("Rect");
		
		sh = new Triangle();
		sh.show("Triangle");
		
		System.out.println("============================");
		// 1. 각자의 클래스로 객체 생성한 형태
		new Circle().show("원");
		new Rect().show("사각형");
		new Triangle().show("삼각형");
		
	}
}
