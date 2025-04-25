package quiz;

import java.util.Scanner;

public class ScoreScanner {
	
	public static void main(String[] args) {
		// kor, eng, com, name 입력받아서 -> total, avg 구하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		String name = " ";
		int kor, eng, com;
		int total = 0;
		double avg = 0;
		char grade = ' ';
		char yn = ' ';
		
		while(true) {
			System.out.print("이름을 입력하세요 : ");
			name = sc.next();
				
			System.out.println(name + "님의 성적을 입력해주세요.");
			do {
				System.out.print("kor:");
				kor = sc.nextInt();
			}while(0 > kor || kor > 100);
			do {
				System.out.print("eng:");
				eng = sc.nextInt();
			}while(0 > eng || eng > 100);
			do {
				System.out.print("com:");
				com = sc.nextInt();
			} while(0 > com || com > 100);
			
		
		total = kor + eng + com;
		avg = total / 3.;
		// 학점(평점) 구하기 - if
//		if (avg >= 90) grade = 'A';
//		else if (avg >= 80) grade = 'B';
//		else if (avg >= 70) grade = 'C';
//		else if (avg >= 60) grade = 'D';
//		else grade = 'F';
		
		// 학점(평점) 구하기 - switch
		switch ((int)avg / 10) {	// total/30 으로 해도 같다. 왜냐하면 과목이 3개이기 때문
		case 10:	
		case 9: grade = 'A'; break;	
		case 8: grade = 'B'; break;	
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		
		default: grade = 'F';
		}
		
		System.out.println(name + "님의 성적");
		System.out.print("kor: " + kor + "\teng: " + eng + "\tcom: " + com + "\ntotal: " + total);
		System.out.printf("\tavg: %.2f\tgrade: %c\n", avg, grade);
		System.out.println("continue?(y/n)");
		
//		yn = sc.next().charAt(0);
//		if(yn =='n' || yn == 'N') break;	
		
		String ans = sc.next();
//		if(ans.toLowerCase() == "n" || ans.toUpperCase() == "N") break;
		if(ans.equalsIgnoreCase("n")) break;		// equalsIgnoreCase() 대소문자 구분 없이 비교하는 함수
		}
	}

}
