package ex02.IF;

import java.util.Scanner;

public class Quiz_사칙연산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x, y, oper = ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
//		int x = sc.nextInt();
//		int y = sc.nextInt();
		
		String oper = sc.next();
		char op = oper.charAt(0);		// string.charAt(0)의 의미는 string의 첫번째 글자를 char 타입으로 변환 시킨다는 뜻
		
		if(op == '+') System.out.println(x + " + "+ y + " = "  + (x + y));
		else if(op == '-') System.out.println(x + " - "+ y + " = "  + (x - y));
		else if(op == '*') System.out.println(x + " * "+ y + " = "   + (x * y));
		else if(op == '/') {
			try {
				System.out.println(x + " / "+ y + " = "  + (x / y));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		else System.out.println("사칙연산 기호만 입력해주세요.");
//		if(oper.equals("+")) System.out.println("x + y = " + (x + y));
//		else if(oper.equals("-")) System.out.println("x - y = " + (x - y));
//		else if(oper.equals("*")) System.out.println("x * y = " + (x * y));
//		else if(oper.equals("/")) {
//			try {
//				System.out.println("x / y = " + (x / y));
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
//		}
//		else System.out.println("사칙연산 기호만 입력해주세요.");
		sc.close();
	}
}
