package quiz;

import java.util.Scanner;

public class 학점 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		do {
			System.out.print("score input = ");
			score = new Scanner(System.in).nextInt();
		} while(score < 0 || score <= 100);
		
		
		
		//if - A, B, C, D, F 학점
//		if ( score > 100 || score < 0) System.out.println("100점이 만점이고 음수의 점수는 없으니 다시 실행하여 입력해주세요.");
//		else if (score > 90 && score <= 100) System.out.println("학점 A");
//		else if(score > 80 && score <= 90) System.out.println("학점 B");
//		else if(score > 70 && score <= 80) System.out.println("학점 C");
//		else if(score > 60 && score <= 70) System.out.println("학점 D");
//		else System.out.println("학점 F");
		
		// switch ~ case - A, B, C, D, F 학점
//		switch (score / 10) {
//		case 10:	
//		case 9: grade = 'A'; break;	
//		case 8: grade = 'B'; break;	
//		case 7: grade = 'C'; break;
//		case 6: grade = 'D'; break;
//		
//		default: grade = 'F';
//		}
		
		// 개선된 switch ~ case. jdk14 이상부터 사용 가능
		grade = switch (score / 10) {
		case 10, 9 -> 'A';	
		case 8 -> 'B';	
		case 7 -> 'C';	
		case 6 -> 'D';	
		default -> 'F';
		};		// 이 형태는 변수에 값을 넣는 것이므로 세미콜론 작성
		
		System.out.println("학점 " + grade);
	}
}