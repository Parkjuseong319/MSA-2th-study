package ex01.scanner;

import java.util.Scanner;

public class ScannerTest {		// 라이브러리에 있던 클래스 명과 user가 만든 클래스 명이 겹칠 경우 user가 만든 클래스가 우선 순위로 작동함
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x, y, str, str2 = ");
		
		String str2 = new Scanner(System.in).nextLine();// 한 줄을 다 읽어들이기 때문에 공백까지 인식
		int x = new Scanner(System.in).nextInt();
//		int y = new Scanner(System.in).nextInt();
		
//		String str = new Scanner(System.in).next();		// 공백을 인식하지 못한다. 앞에 있는 단어만 인식한다.
//		String str2 = new Scanner(System.in).nextLine();// 한 줄을 다 읽어들이기 때문에 공백까지 인식
		
//		System.out.println(x + " " + y + " " + str + " " + str2);
		System.out.println(x + ", " + str2);
		
	}

}
