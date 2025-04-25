package quiz;

import java.util.Scanner;

public class UpDownGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int randomInt = (int)(Math.random()*100) + 1;
		System.out.println("up/down 게임입니다. 기회는 총 5번\n숫자를 입력해주세요.");
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			if(randomInt > n ) {
				System.out.println("up");
			}else if(randomInt < n) {
				System.out.println("down");
			}else System.out.println("정답!");
		}
		System.out.println("입력 기회는 다 소진하였습니다. 답은 " + randomInt + "이었습니다.");
		sc.close();
	}
}
