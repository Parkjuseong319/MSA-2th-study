package quiz;

import java.util.Scanner;

public class 사칙연산함수 {

	public void add(double x, double y) {
		System.out.println(x + " + " + y + " = " + (x + y));
	}

	public void sub(double x, double y) {
		System.out.println(x + " - " + y + " = " + (x - y));
	}

	public double mul(double x, double y) {
		return x * y;
	}

	public double div(double x, double y) {
		if (y == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.exit(0);
		}
		return x / y;
	}

	public static void main(String[] args) {
		// x, y 입력받아 add(), sub(), mul(), div()
		Scanner sc = new Scanner(System.in);
		System.out.println("간단한 계산기");
		사칙연산함수 calc = new 사칙연산함수();
		
		while (true) {
			System.out.print("x의 값: ");
			double x = sc.nextDouble();
			System.out.print("y의 값: ");
			double y = sc.nextDouble();
			System.out.print("연산기호. 0입력 시 시스템 종료: ");
			char op = sc.next().charAt(0);

			switch (op) {
			case '+': calc.add(x, y); break;
			case '-': calc.sub(x, y); break;
			case '*': System.out.println(x + " * " + y + " = " + calc.mul(x, y)); break;
			case '/': System.out.println(x + " / " + y + " = " + calc.div(x, y)); break;
			case '0': System.out.println("시스템을 종료합니다."); System.exit(0);
				sc.close();
			default: System.out.println("사칙연산 기호나 0을 입력하세요");
			}
		}
	}
}
