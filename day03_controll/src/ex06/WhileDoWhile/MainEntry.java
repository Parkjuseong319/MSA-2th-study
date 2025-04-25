//*
package ex06.WhileDoWhile;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("원하는 단을 입력하세요");
		int dan = new Scanner(System.in).nextInt();
		int a = 1;
		
		do {
			System.out.println(dan + " * " + a + " = " + (dan*a));
			a++;
			
		} while(a<10);
		
		
		
//		int a = 1; // while문에서 변수값 초기화가 반드시 있어야한다.
//		
//		while( a <= 3) {	// a++ <= 3 이렇게 조건문 작성하고 실행문에서 증감식을 빼도 된다.
//			System.out.print(a + "\t");
//			a++;
//		}
	}
}
//*/