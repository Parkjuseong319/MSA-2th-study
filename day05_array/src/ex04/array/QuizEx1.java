package ex04.array;

import java.util.Scanner;

public class QuizEx1 {
	public static void main(String[] args) {
		// 배열 여러개 데이터 중에서 7의 개수를 찾기
		int[] a = new int[]{7,3,7,8,1,9,7,100,12,7,33,7};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("a배열의 총합 = " + sum);
		System.out.println("================");
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == 7) count ++;
		}
		System.out.println("7의 개수: " + count);
		
		//1. 배열 데이터 값 출력
		System.out.println(a.length);
	}
}
