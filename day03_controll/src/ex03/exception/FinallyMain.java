package ex03.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyMain {
	public static void main(String[] args) {
		System.out.println("x, y =");
		int x, y, result;
		
		try {
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			
			result = x/y; 	// 에러 발생 할 수 있다.
			
			System.out.println(result);
			
		} catch (ArithmeticException e) {	// e는 에러에 관한 메세지를 담고 있는 객체이다.
			System.out.println("ArithmeticException");
			
		} catch (InputMismatchException e) {	// e는 에러에 관한 메세지를 담고 있는 객체이다.
			System.out.println("InputMismatchException");
			
		} catch (Exception e) {	// e는 에러에 관한 메세지를 담고 있는 객체이다.
			System.out.println("Exception");
		} finally {
			// exception 발생 여부와 상관없이 수행할 문장들
			System.out.println("finally 무조건 처리된다.");
		}
	}
}
