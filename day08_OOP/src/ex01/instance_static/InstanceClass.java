package ex01.instance_static;

class B{
	int x, y;
	
	public void setData(int xx, int yy) {
		System.out.println(xx + ", " + yy);
	}
}

public class InstanceClass {
	public static void main(String[] args) {
		B b = new B();		// 객체 생성, 메모리상에 할당, 생성자함수 자동 호출
		b.setData(3, 5);
	}
}

/*
	instance method: 객체 생성하고 사용해야한다(메모리상에 할당되어야한다.)
	ex) Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

*/