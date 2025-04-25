package ex04.array;

import java.util.Iterator;

public class MainEntry {
	public static void main(String[] args) {
		//1차원 배열
		char[] ch; //배열 선언
		ch = new char[4];	// 배열 생성, 메모리에 할당
		
		//2
		char[] ch2 = new char[4];
		
		//배열 초기화
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		//3.
		char[] ch3 = {'j', 'a', 'v', 'a', 'k', 'b', 's', 's', 'b', 's'};
		
		//배열의 길이(크기)
		System.out.println("배열의 길이(크기): " + ch2.length);
		System.out.println("배열의 길이(크기): " + ch3.length);
		
		//배열의 내용 출력
		System.out.println("ch[2] = " + ch[2]);
		System.out.println("=============================");
		for (int i = 0; i < ch.length; i++) {	// 배열의 길이를 구하는 필드 length 이용
			System.out.println("ch["+i+"] = " + ch[i]);
			
		}
		
	}
}
