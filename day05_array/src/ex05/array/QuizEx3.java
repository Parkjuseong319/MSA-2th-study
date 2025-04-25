package ex05.array;

import java.util.Iterator;
import java.util.Scanner;

public class QuizEx3 {
	public static void main(String[] args) {
		int[][] a = new int[2][3];
		//2차원 배열에 임의적인 숫자 입력 받아서 합 출력
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int)(Math.random()*100) +1;
				sum += a[i][j];
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t"); 
			}
			System.out.println();
		}
		
		System.out.println("총합: " + sum);
		
//		int[][] a = new int[2][3];
//		//2차원 배열에 임의적인 숫자 입력 받아서 합 출력
//		int sum = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 6번 입력해주세요");
//		
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				a[i][j] = sc.nextInt();
//				sum += a[i][j];
//			}
//		}
//		System.out.println("총합: " + sum);
//		sc.close();
		
	}
}
