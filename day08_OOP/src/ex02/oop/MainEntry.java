package ex02.oop;




class Point{		// extends Object  <= 모든 클래스는 Object class를 상속받는다. 최상위 클래스 이기 때문
	int x, y;		// 멤버변수 - 접근지정자: private < default < protected < public
					// default는 자동으로 지정된다. 같은 패키지 내에서 호출할 수 있는 접근지정자.
	
	//멤버함수
	public int getX() {
		return x;
	}
	public void setX(int xx) {
		x = xx;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int yy) {
		y = yy;
	}
	
	public void setData(int xx, int yy) {
		x = xx;
		y = yy;
	}
	
	public void display() {
//		System.out.println(x + ", " + y);
		System.out.println(getX() + ", " + getY());
	}
	
}

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();		// 객체생성, 메모리할당, 생성자함수 자동호출
		
		pt.x = 500;
		pt.y = 300;
		System.out.println(pt.x + ", " + pt.y);
		
		
		pt.setX(100);
		pt.setY(200);
		pt.display();
//		System.out.println(pt.getX() + ", " + pt.getY());
//		pt.setData(1, 2);
//		
//		
//		pt.setX(55);
//		System.out.println(pt.getX());
//		
//		System.out.println(pt.toString());
//		System.out.println(pt);
	}
}
/*
 접근제어자 public이 있는 클래스는 한개만 있어야한다. 또한 main 메서드는 public class에 생성해야한다. 

*/