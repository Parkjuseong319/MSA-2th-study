package quiz;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer cs = new Customer();
		
		while(true) {
			System.out.println("어떤 작업을 하시겠습니까?");
			System.out.println("1. 고객 추가 / 2. 고객 삭제 / 3. 고객 리스트 보기 / 4. 고객 정보 수정 / 0. 종료하기");
			int a = sc.nextInt();
			switch (a) {
			case 1: {
				System.out.print("번호, 이름, 주소, 전화번호 순서로 입력: ");
				cs.AddCustomer(sc.next(), sc.next(), sc.next(), sc.next());
				break;
			}
			case 2: {
				System.out.print("삭제할 고객 번호: ");
				int n = sc.nextInt();
				n -= 1;
				int delete = 4*n;
				cs.DeleteCustomer(delete);
				break;
			}
			case 3: {
				cs.ViewCustomer();
				break;
			}
			case 4:{
				System.out.print("수정할 고객의 번호: ");
				int n = sc.nextInt();
				n -= 1;
				System.out.println("수정할 내용\n 1. 번호 / 2. 이름 / 3. 주소 / 4. 전화번호");
				int nn = (sc.nextInt()-1);
				int insert = 4*n+nn;
				if(nn <= 3 && nn >= 0) {
					cs.InsertCustomer(insert, sc.next());
				}
				else System.out.println("1~4에서 선택해주세요");
				break;
			}
			case 0: System.out.println("프로그램을 종료합니다. "); System.exit(0);
			}
		}
		
	}

}
