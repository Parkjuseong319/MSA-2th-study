package quiz;

import java.util.Scanner;

public class ScoreScanner {
	
	public static String[] input() {	// 입력받기. 세 과목 점수와 이름 리턴...
		String name = " ";
		int kor, eng, com;
		Scanner sc = new Scanner(System.in);
		String[] str = new String[4];
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		str[0] = name;
			
		System.out.println(name + "님의 성적을 입력해주세요.");
		do {
			System.out.print("kor: ");
			kor = sc.nextInt();
			str[1] = Integer.toString(kor);
			
		}while(0 > kor || kor > 100);
		do {
			System.out.print("eng: ");
			eng = sc.nextInt();
			str[2] = Integer.toString(eng);
		}while(0 > eng || eng > 100);
		do {
			System.out.print("com: ");
			com = sc.nextInt();
			str[3] = Integer.toString(com);
		} while(0 > com || com > 100);
		
		return str;
	}
	
	// 출력 함수. 인자 값 받아야함
	public static void output(String name, int kor, int eng, int com, int total, double avg, char grade) {	
		System.out.println(name + "님의 성적");
		System.out.print("kor: " + kor + " \teng: " + eng + " \tcom: " + com + "\ntotal: " + total);
		System.out.printf("\tavg: %.2f\tgrade: %c\n", avg, grade);
	}
	
	// 총합, 평균 구하는 함수. 인자값 3개. 리턴 double로
	public static double[] total_avg(int kor, int eng, int com) {	
		double[] result = new double[2];
		result[0] = kor + eng + com;
		result[1] = result[0]/ 3.;
		return result;
	}
	
	// 학점 구하는 함수. 인자 + 리턴값(char)
	public static char grade(int total) {
		char grade = ' ';
		switch (total / 30) {
			case 10:	
			case 9: grade = 'A'; break;	
			case 8: grade = 'B'; break;	
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			default: grade = 'F';
		}
		return grade;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			String[] info = input();	// 이름과 과목별 점수
			int kor = Integer.parseInt(info[1]);
			int eng = Integer.parseInt(info[2]);
			int com = Integer.parseInt(info[3]);
			
			double[] total = total_avg(kor, eng, com);
			char grade = grade((int)total[0]);
		
			output(info[0], kor, eng, com, (int)total[0], total[1], grade);
		
			System.out.println("continue?(y/n)");
			String ans = sc.next();
			if(ans.equalsIgnoreCase("n")) break;		
		}
		sc.close();
	}
}
