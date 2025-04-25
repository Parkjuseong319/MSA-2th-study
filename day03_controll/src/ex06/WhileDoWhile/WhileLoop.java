package ex06.WhileDoWhile;

import java.util.Scanner;

public class WhileLoop {
	
	public static void main(String[] args) {
		
		int su;
		char grade = ' ', yn= ' ';
		Scanner sc = new Scanner(System.in);
		
		while(true) {		// 무한루프
			
			do {
				System.out.print("your score:");
				su = sc.nextInt();
			}while(su < 0 || su > 100);
			
			System.out.println("\n당신의 점수" + su + "\n");
			
			// 탈출구문
			System.out.println("계속 입력하시겠습니까?(y/n)");
			yn = sc.next().charAt(0);
			if(yn == 'n' || yn =='N') break;
			
		}	//end
	}
}
