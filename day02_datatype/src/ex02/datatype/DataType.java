package ex02.datatype;

public class DataType {
	
	public static void main(String[] args) {
		String str = "A";	// 쌍따옴표 안에 들어가면 문자열이다. 2byte를 할당
		char ch = 'A';		// 홑따옴표 안에 들어가면 문자이다. 1byte를 할당. 또다른 형태의 작은 정수타입
		char ch2 = 65; 		// ASCII code로 인해 에러 발생하지 않고 변환되어 출력된다.
		char ch3 = 'C';
		
		int su = 20; String nickName = "Happy"; double d =12.34;
		
		System.out.println(ch);
		System.out.println(str);
		System.out.println((int)ch);	// ASCII code 65
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		System.out.println(ch2+ch3);	// 연산되어 132라는 결과
		
		System.out.println("nickname = "+nickName);	// 같은 타입끼린 더하기 가능
		System.out.println("실수형 데이터: " + d);
		
		for(int i=65; i <= 90; i++) {
			System.out.print((char)i + " ");
		}
		System.out.println();
		for(int i= 'a'; i <= 'z'; i++) {
			System.out.print((char)i + "\t");
		}
		
		System.out.println("\n\nboolean type");
		boolean flag = true;
		//int b = flag;	// error.  java에선 boolean 타입은 0과 1로 변환되지않는다. 
		System.out.println(flag);
	}
}
