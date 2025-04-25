package ex02.datatype;

public class DataType3 {
	// 진법
	public static void main(String[] args) {
		int su = 10;
		
		System.out.println("10진수: " + su); 	// %d, %o, %x, %X
		System.out.printf("10진수 %d\n", su);
		System.out.printf("8진수 %o\n", su);
		System.out.printf("16진수 %x %X\n", su, su);
		
		// 0숫자 --> 8진수, 0x숫자 --> 16진수
		System.out.printf("%d\n", 012);	// 012(8진수) --> 10진수 출력
		System.out.printf("%d\n", 0xA);	// 0xA(16진수) --> 10진수 출력
	}
}

/*
	10진수: 0~9의 수들을 조합하여 사용.
	8진수: 0~7의 수들을 조합하여 사용. 0 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 20
	16진수: 0~15가지의 수를 사용. 0~9, a, b, c, d, e, f를 조합하여 사용
	0 1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a 1b .....
 */
 