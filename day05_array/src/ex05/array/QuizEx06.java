package ex05.array;

import java.util.Scanner;

public class QuizEx06 {
	public static void main(String[] args) {
		
		int[][] a = new int[2][3];	//객체생성, 메모리에 할당, 생성자 함수 자동호출
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {	// a.length는 행의 크기
			for (int j = 0; j < a[i].length; j++) {		// a[i].length는 열의 크기
				System.out.print("array["+i+"]["+j+"] = ");
				a[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
