package ex01.scanner;

import java.util.Scanner;	// ctrl + shift + o <--- 자동 import

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("integer data input: ");
		int i = sc.nextInt();
		
		System.out.println(i);
	}
}
