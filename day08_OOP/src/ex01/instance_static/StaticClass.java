package ex01.instance_static;

class A{
	int x, y;
	
	// static method
	public static void setData(int xx, int yy) {
		System.out.println(xx + ", " + yy);
	}
}

public class StaticClass {
	
	public static void main(String[] args) {
		A a = new A();		// 객체 생성, 메모리 할당, 생성자 함수 자동 호출
		a.setData(3, 5);	// object.methodName(); 방식의 호출
		A.setData(200, 500);// ClassName.methodName(); 방식의 호출
		
		a.x =1234;
		A.setData(3, 4);
		
	}
}
/*
	static method: 객체 생성 없이 바로 사용 가능함
		ex) Math.random()
	호출법 > 클래스명.메서드명();
			객체명.메서드명();

*/