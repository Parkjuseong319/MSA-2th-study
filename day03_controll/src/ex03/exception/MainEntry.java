
//*
package ex03.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("x, y =");
		int x, y, result;
		
		try {
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			
			result = x/y; 	// 에러 발생 할 수 있다.
			
			System.out.println(result);
			
		} catch (ArithmeticException e) {	// e는 에러에 관한 메세지를 담고 있는 객체이다.
//			System.out.println("0으로 나눌 수 없습니다.");	// user message
//			System.out.println(e.getMessage());
			System.out.println("ArithmeticException");
//			e.printStackTrace();		// 문제 발생을 단계 별로 상세하게 출력해주는 method
			
		} catch (InputMismatchException e) {	// e는 에러에 관한 메세지를 담고 있는 객체이다.
			System.out.println("InputMismatchException");
//			e.printStackTrace();		// 문제 발생을 단계 별로 상세하게 출력해주는 method
			
		} catch (Exception e) {	// e는 에러에 관한 메세지를 담고 있는 객체이다.
			System.out.println("Exception");
//			e.printStackTrace();		// 문제 발생을 단계 별로 상세하게 출력해주는 method
			
		}
	}
}
//*/
/*
package ex03.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("x, y =");
		int x, y, result;
		
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		
		if( y == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.exit(0);		// 컴파일 강제 종료하는 명령어
		}
		result = x/y; 	// 에러 발생 할 수 있다.
		
		System.out.println(result);
	}
}
//*/

/*
package ex03.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("x, y =");
		int x, y, result;
		
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		
		result = x/y; 	// 에러 발생 할 수 있다.
		
		System.out.println(result);
	}
}
//*/