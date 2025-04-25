package ex06.MultiImplements;

import ex03.Abstract.Shape;
import ex05.Interface.IDraw;

public class MultiClass extends Shape implements IDraw, Test {

	private int num;
	
	public void display() {
		System.out.println("MultiClass method");
	}
	@Override
	public double calc(double x) {		// Shape
		System.out.println("Shape abstract class");
		return 5.5;
	}

	@Override
	public void show(String name) {		// Shape
		System.out.println("Shape abstract class" + name);
	}

	@Override
	public void view() {				// Shape
		System.out.println("Shape abstract class");
		super.view();
	}

	@Override
	public void testView() {	// test
		System.out.println("Test interface" + str);

	}

	@Override
	public void draw() {	// IDraw
		num = 888;
		System.out.println("IDraw interface" + num);
	}

}
