package ex01.oop;

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();		// 객체생성, 메모리 할당, 생성자함수 자동 호출
		pt.disp();
		System.out.println(pt.hashCode());
		
		Point pt2 = new Point(12);		// 객체생성, 메모리 할당, 생성자함수 자동 호출
		pt2.disp();
		System.out.println(pt2.hashCode());
		
		Point pt3 = new Point(15, 22);		// 객체생성, 메모리 할당, 생성자함수 자동 호출
		pt3.disp();
		System.out.println(pt3.hashCode());
	}
}
