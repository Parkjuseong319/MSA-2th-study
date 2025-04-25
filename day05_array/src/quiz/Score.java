package quiz;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// 7명의 성적을 입력 받아서 총점, 평균, 평점까지 구하는 프로그램 작성
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("몇명의 성적을 입력하시나요?");
			int su = sc.nextInt();
			int[] total = new int[su];
			char[] grade = new char[su];
			double[] avgList = new double[su]; // 성적 비교
			int[][] arr = new int[su][3]; // 행에 사람번호, 열에 과목 순서로 넣기
			String[] name = new String[su];
			int[] sukcha = new int[su];

			for (int i = 0; i < arr.length; i++) {
				System.out.print("이름을 입력하세요 : ");
				name[i] = sc.next();
				System.out.println(name[i] + "님의 성적을 입력해주세요.");

				do {
					System.out.print("국어 점수: ");
					arr[i][0] = sc.nextInt();
				} while (0 > arr[i][0] || arr[i][0] > 100);
				do {
					System.out.print("영어 점수: ");
					arr[i][1] = sc.nextInt();
				} while (0 > arr[i][1] || arr[i][1] > 100);
				do {
					System.out.print("전산 점수: ");
					arr[i][2] = sc.nextInt();
				} while (0 > arr[i][2] || arr[i][2] > 100);
			} // 성적 입력 7회 실행 끝

			System.out.println("================================================="); // 구분선
			for (int i = 0; i < name.length; i++) {
				total[i] = arr[i][0] + arr[i][1] + arr[i][2];
				avgList[i] = total[i] / 3.;

				// 학점(평점) 구하기
				switch ((int) avgList[i] / 10) {
				case 10:
				case 9:
					grade[i] = 'A';
					break;
				case 8:
					grade[i] = 'B';
					break;
				case 7:
					grade[i] = 'C';
					break;
				case 6:
					grade[i] = 'D';
					break;

				default:
					grade[i] = 'F';
				}

			}
			
			// 등수 구하기
			for (int i = 0; i < total.length; i++) {
				int temp = 1;
				for (int j = 0; j < total.length; j++) {
					if (total[i] < total[j])
						temp += 1;
				}
				sukcha[i] = temp;
			}

			for (int i = 0; i < avgList.length; i++) {
				System.out.println(name[i] + "님의 성적");
				System.out.printf("kor: %d \t eng: %d\t com: %d\ntotal: %d", arr[i][0], arr[i][1], arr[i][2], total[i]);
				System.out.printf("\tavg: %.2f\tgrade: %c\n 석차: %d \n", avgList[i], grade[i], sukcha[i]);
				System.out.println("================================================="); // 다음 사람과 구분하기
			}

			System.out.println("\n");
			System.out.println("continue?(y/n)");
			String ans = sc.next();
			if (ans.equalsIgnoreCase("n"))
				break;
		}
		System.out.println("성적 계산기 종료...");
		sc.close();
	}

}
