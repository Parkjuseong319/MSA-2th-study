package ex02.method;

import java.util.Scanner;

public class MethodEx1 {
	// 3. 매개변수 없고, 리턴타입 있는 경우
	public static int show() {	// 리턴타입이 있을 경우 return 키워드로 값 반환 없다면 에러 발생한다.
		return 999;
	}
	
	public static void name() {
		System.out.println("zoo");
	}
	public static void main(String[] args) {
		System.out.println(show());
		
		int su = show();
		System.out.println(su);
		
		System.out.println("최대값: " + max());
		
	}
	
	public static int max() {
		Scanner sc = new Scanner(System.in);
		System.out.print("x, y = ? ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		return (x>y)? x:y;
	}
	
}
