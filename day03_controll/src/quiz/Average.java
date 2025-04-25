package quiz;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("응시생의 이름을 입력해주세요 : ");
		String name = sc.next();
		
		int kor, eng, math, science, com, total, falseScore = 0;
		double avg;
		String str = "";
		boolean result = false;
		
		System.out.println("다섯 과목의 점수를 입력해주세요");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		science = sc.nextInt();
		com = sc.nextInt();
		
		total = kor + eng + math + science + com;
		avg = total / 5;
		
		if(avg < 60) result = false;
		else if(kor < 40) {
			str = "국어";
			falseScore = kor;
		}
		else if(eng < 40){
			str = "영어";
			falseScore = eng;
		}
		else if(math < 40) {
			str = "수학";
			falseScore = math;
		}
		else if(science < 40) {
			str = "과학";
			falseScore = science;
		}
		else if(com < 40) {
			str = "전산";
			falseScore = com;
		}
		else result = true;
		
		String finalResult = (result)? "합격":"불합격";

		System.out.println("\n");
		if(result)	System.out.println(name + "님은 " +"평균 점수 "+ avg + "로 " +finalResult + "하셨습니다.");
		else System.out.println(name + "님은 " +"평균 점수 "+ avg + "로 " + finalResult + "하셨습니다. \n과락한 과목은 " + str + "(으)로 점수는 " + falseScore + "입니다.");
		
	}
}
