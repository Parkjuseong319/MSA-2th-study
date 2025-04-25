package ex06.WhileDoWhile;

public class MultiWhile {
	public static void main(String[] args) {
		//구구단 전체 출력 - 중첩 while문 이용
		int a = 2, b;
		
		while(a<10) {
			b=1;
			while(b<10) {
				System.out.println(a + " * " + b + " = " + (a*b));
				b++;
			}
			System.out.println();
			a++;
		}
	}
}
