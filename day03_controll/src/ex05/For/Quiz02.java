//*
package ex05.For;

public class Quiz02 {
	public static void main(String[] args) {
		// 모든 구구단 출력하기
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + (i*j) + "\t");
			}
			System.out.println();
		}
	}
}
//*/
/*
package ex05.For;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// 원하는 단을 입력 받아서 구구단 출력하
		System.out.println("몇 단을 출력할까요?");
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
	}
}
//*/