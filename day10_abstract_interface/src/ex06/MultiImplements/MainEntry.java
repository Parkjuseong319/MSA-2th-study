package ex06.MultiImplements;

import ex03.Abstract.Shape;

public class MainEntry {
	public static void main(String[] args) {
		// 1. 자기 자신
		MultiClass m = new MultiClass();
		m.draw();
		m.calc(7.7);
		m.display();
		m.show("zoo");
		m.testView();
		m.view();
		System.out.println("================================");
		// 2. 부모로 객체 생성
		Shape m2 = new MultiClass();
		m2.calc(7.7);
		m2.show("asdf");
		m2.view();
		
	}
}
