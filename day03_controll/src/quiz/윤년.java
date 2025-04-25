package quiz;

import java.util.Scanner;

public class 윤년 {		// 윤년과 평년 판정 프로그램
	public static void main(String[] args) {
		System.out.print("연도를 입력해주세요 : ");
		int year = new Scanner(System.in).nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0) System.out.println(year + "년도는 윤년");
		else System.out.println(year + "년도는 평년");
	}
}
