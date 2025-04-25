package ex02.oop;

import java.util.Scanner;

class Circle {
	int x, y, r;
	
//	public Circle() {	// 생성자함수 - 디폴트 생성자. 리턴타입 없다.
//		x = y = 100;
//		r = 5;
//	}
	
	public Circle(int x) {	// 디폴트 생성자 함수 overloading.
		this.x = x;
		y = 50;
		r = 7;
	}
	public Circle(int x, int r) {	// 디폴트 생성자 함수 overloading.
		this.x = x;
		y = 33;
		this.r = 7;
	}
	public Circle(int x,int y, int r) {	// 디폴트 생성자 함수 overloading.
		this.x = x;
		this.y = y;
		this.r = 7;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int a) {
		x = a;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int a) {
		y = a;
	}
	
	public int getR() {
		return r;
	}
	public void setR(int a) {
		r = a;
	}
	
	public void display() {
		System.out.println("원의 중심좌표는 (" + x + ", " + y + ") 이고 반지름은 " + r + "이며 넓이는 " + ( r*r * Math.PI) +"입니다.");
	}
	
}


public class CircleMain {
	public static void main(String[] args) {
		Circle cir = new Circle(2);
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("원의 중심좌표를 입력하세요");
//		cir.setX(sc.nextInt());
//		cir.setY(sc.nextInt());
//		System.out.println("원의 반지름을 입력해주세요");
//		cir.setR(sc.nextInt());
//		cir.display(cir.getX(), cir.getY(), cir.getR());
		
		Circle c2 = new Circle(1,2);
		c2.display();
		
		Circle c3 = new Circle(1,2,3);
		c2.display();
		
		sc.close();
	}

}
