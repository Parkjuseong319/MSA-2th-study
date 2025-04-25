package ex02.oop;

import java.util.Scanner;

public class RectMain {
	public static void main(String[] args) {
		// Rectangle class object create
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print("x의 좌표: ");
		rect.setX(sc.nextInt());
		System.out.print("y의 좌표: ");
		rect.setY(sc.nextInt());
		System.out.print("x2의 좌표: ");
		rect.setX2(sc.nextInt());
		System.out.print("y2의 좌표: ");
		rect.setY2(sc.nextInt());
		
		rect.output(rect.getX(), rect.getY(), rect.getX2(), rect.getY2());
	
		sc.close();
	}
}
