package ex04.array;

import java.util.Scanner;

public class QuizEx2 {
	public static void main(String[] args) {
		// 특정달(30일 기준) 강수량 평균 구하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.println("이번 달의 일 수는 몇일인가요?");
		int num = sc.nextInt();
		double[] rain = new double[num];
		double avg = 0.0;
		for (int i = 0; i < rain.length; i++) {
			System.out.print((i+1) + "일의 강수량을 입력해주세요. ");
			rain[i] = sc.nextDouble();
			avg += rain[i] / rain.length;
		}
		System.out.printf("4월 강수량 평균은 %.2f입니다", (float)avg);
		sc.close();
	}

}
