package ex01.java;

public class MainEntry {
	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println(c.add(1, 2));
		System.out.println(c.add(10, 3));
		System.out.println();
		System.out.println(c.mul(4, 6));
		System.out.println(c.mul(3, 5));
	}
}
