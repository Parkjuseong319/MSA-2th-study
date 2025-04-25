package ex02.method;

public class MainEntry {
	
	// 2. 매개변수 있고 리턴타입이 없는 경우
	public static void plus(int x, int y, String msg) {	// 함수정의부(구현부)
		System.out.println("hap = " + (x + y));
		int sum = x + y;
		System.out.println("sum = " + sum);
		System.out.println(msg);
		System.out.println(x + " " + y + " " + msg);
	}
	
	// 절대값 구하는 함수 구현하기
	public static void abs(int x) {
		if(x < 0) {
			System.out.println("절대값: " + (x*(-1)));
		}
		else System.out.println("절대값: " + (x));
	}
	
	public static void main(String[] args) {	// 컴파일의 시작점(진입점)
		plus(1, 2, "Hi");
		abs(-4);
		abs(6);
		line();
		System.out.println("start main");
//		info();
//		line();
//		info();
//		line();
//		line();
		System.out.println("end main");
		
	}
	
	// 1. 매개변수 없고 리턴타입 없는 경우
	public static void info() {
		System.out.println("zoo");
		System.out.println("010-1234-5678");
		System.out.println("ansan");
	}
	
	public static void line() {
		System.out.println("--------------------------------------------");
	}
}
