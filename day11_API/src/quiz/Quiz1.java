package quiz;

import java.util.Scanner;

// String str = " "; 임의적인 문자열 입력 받아서 대문자는 소문자로 소문자는 대문자로 출력하는 프로그램
public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if(Character.isLowerCase(ch[i])) ch[i] = Character.toUpperCase(ch[i]);
			else if(Character.isUpperCase(ch[i])) ch[i] = Character.toLowerCase(ch[i]);
		}
		System.out.println("원래 문자열: " +str);
		System.out.print("바뀐 문자열: ");
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		sc.close();
		
	}
}
