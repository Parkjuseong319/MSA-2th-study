package ex06.string;

public class StringMethod {
	public static void main(String[] args) {
		String s1 = "happyZoo";
		String s2 = "SEOUL";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.replace("EO", "korea"));	//SkoreaUL   문자열 변환
		System.out.println(s2);		//SEOUL
		
//		s2 = s2.replace("EO", "korea");
//		System.out.println(s2);	
		System.out.println("===================================");
		
		s1 = s1 + s2;
		s1 = s1.concat(s2);	// 문자열 결합
		System.out.println(s1);
		System.out.println("===================================");
		
		String s3 = new String("     ab    cd    ");
		System.out.println(s3);
		System.out.println(s3.length());		// 문자열 길이
		s3 = s3.trim();		// 공백 제거. 문자 사이에 있는 공백은 제거하지 못하고 양 끝 공백만 제거
		System.out.println(s3.length());	
		
//		String s4 = new String("ab cdefg 491042 keiaof 291912");
//		String[] s5 = s4.split(" ");		// 배열타입으로 반환. 이 수식은 공백 기준으로 끊어서 배열로 저장
		String s4 = new String("ab/cdefg/491042/keiaof/291912");
		String[] s5 = s4.split("/");		
		for (int i = 0; i < s5.length; i++) {
			System.out.println("분리된 " + i + "번 문자열: " + s5[i]);
		}
		
		String s6 = "123-4567-8901";
		String[] s7 = s6.split("-");
		for (int i = 0; i < s7.length; i++) {
			System.out.println(s7[i]);
		}
		
		String s8 = "1k21dskjkop ijafsodi 21 ksldaf disjgdsj string";
		char ch = s8.charAt(8);			// char타입으로 변환
		System.out.println(ch);			// k 출력
		
		s8 = s8.substring(5,7);
		System.out.println(s8);			// sk 출력
		
		System.out.println("=================================");
		System.out.println("소문자로 출력 toLowerCase(): " + s2.toLowerCase());
		System.out.println("대문자로 출력 toUpperCase(): " + s1.toUpperCase());
		
		char[] ch2 = s1.toCharArray();
		for (int i = 0; i < ch2.length; i++) {
			System.out.println(ch2[i] + "\t");
		}
		
	}
}
