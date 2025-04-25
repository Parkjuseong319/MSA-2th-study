package quiz_score;

import java.util.Scanner;

// ArrayList or Vector 이용해서 학생 추가/ 삭제/학생리스트 출력/ 수정/프로그램 종료 메뉴 구성하는 프로그램
public class ScoreMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Score cs = new Score();
		
		while(true) {
			System.out.println("어떤 작업을 하시겠습니까?");
			System.out.println("1. 학생 추가 / 2. 학생 삭제 / 3. 학생 리스트 보기 / 4. 학생 정보 수정 / 0. 종료하기");
			int a = sc.nextInt();
			switch (a) {
			case 1: {
				System.out.print("번호, 이름, 국어점수, 영어점수, 전산점수 순서로 입력: ");
				cs.input();
				break;
			}
			case 2: {
				System.out.print("삭제할 학생 번호: ");
				int n = sc.nextInt();
				n -= 1;
				int delete = 7*n;
				cs.DeleteStudent(delete);
				break;
			}
			case 3: {
				cs.ViewStudent();
				break;
			}
			case 4:{
				System.out.print("수정할 고객의 번호: ");
				int n = sc.nextInt();
				n -= 1;
				System.out.println("수정할 내용\n1. 번호 / 2. 이름 / 3. 국어점수 / 4. 영어점수 / 5. 전산 점수");
				int nn = (sc.nextInt()-1);
				int insert = 7*n+nn;
				if(nn <= 1 && nn >= 0) {
					cs.InsertStudent(insert, sc.next());
				}else if(nn >= 2 && nn <= 4) cs.InsertStudent(insert, sc.nextInt());
				else System.out.println("1~7 중에 선택해주세요");
				break;
			}
			case 0: System.out.println("프로그램을 종료합니다. "); System.exit(0);
			}
		}
	}

}
