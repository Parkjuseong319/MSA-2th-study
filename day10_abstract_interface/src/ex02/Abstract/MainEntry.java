package ex02.Abstract;

public class MainEntry {
	public static void main(String[] args) {
		// 1. 각자의 클래스로 객체 생성
		new Rectangle().draw();
		new Circle().draw();
		new Triangle().draw();
	}
}
