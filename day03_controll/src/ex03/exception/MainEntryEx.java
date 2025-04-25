//*
package ex03.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainEntryEx {
	public static void main(String[] args) throws ArithmeticException, InputMismatchException{	// 예외처리 위임
	// 예외처리 위임은 JVM의 도움으로 가능하다. 
			System.out.println("x, y =");
			int x, y, result;
			
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			
			result = x / y; // 에러 발생 할 수 있다.
			
			System.out.println(result);
			
	}
}
//*/
/*
package ex03.exception;

import java.util.Scanner;

public class MainEntryEx {
	public static void main(String[] args) {
		try {
			System.out.println("x, y =");
			int x, y, result;
			
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			
			result = x / y; // 에러 발생 할 수 있다.
			
			System.out.println(result);
			
		} catch (Exception e) {
//			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
//*/