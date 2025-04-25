package ex01.randomMethod;

public class MainEntry {
	public static void main(String[] args) {
		
		System.out.println(Math.random());	//
		System.out.println((int)Math.random());
		// Math.random()*n <==== 0~n-1까지 추출된다.
		
		System.out.println(Math.random()*5);		// 0~4
		System.out.println((Math.random()*5) + 2);		// 2~6
		System.out.println((int)(Math.random()*100) + 1);		// 1~100
		
	}
}
