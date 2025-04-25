//*
package ex05.For;

public class MainEntry {
	public static void main(String[] args) {
		int a=1,b=2  ;
		for ( ; ; b +=2) {		// 무한루프 - 탈출구문 필요
			System.out.print(b + "\t");
			if(b==10) break;
		}
		
	}
}
//*/
/*
package ex04.For;

public class MainEntry {
	public static void main(String[] args) {
		int a,b  ;
		for (a=1, b =2; a <=5; a++,b+=2) {		// for문 초기값/증감식 생략 가능. 조건식은 생략 불가. 
			System.out.print(b + "\t");
		}
		
	}
}
//*/
/*
package ex04.For;

public class MainEntry {
	public static void main(String[] args) {
		int a = 1;
		for (; a <=5 ;) {		// for문 초기값/증감식 생략 가능. 조건식은 생략 불가. 
			System.out.print(a + "\t");
			a++;
		}
		
	}
}
//*/