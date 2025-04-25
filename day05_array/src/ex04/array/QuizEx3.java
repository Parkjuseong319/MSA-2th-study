package ex04.array;

import java.util.Scanner;

public class QuizEx3 {
	public static void main(String[] args) {
		int[] a = new int[5];	//new 키워드를 사용함으로 객체생성, 메모리 할당. 
		// 객체는 선언 됐을때 빈 메모리에는 0으로 채워져 있다.
		// 임의의 데이터 입력 받아서 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 5개 입력해주세요");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+ "\t");
		}
		sc.close();
		
	}
}
