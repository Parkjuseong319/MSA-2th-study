//*
package ex03.operator;

// 최단산쉬관논삼대콤 순서로 우선 연산된다.
public class MainEntry {
	public static void main(String[] args) {
		// 산술연산자: +, -, *, /, %, ^, ...
		int x = 10, y = 20;
		int gob = x * y;
		
		System.out.println("x * y = " + (x*y));
		System.out.println("------------------------------------");
		
		// 정수 (+, -, *, /, %, ^) 정수 = 정수
		System.out.println("\n\n7/3" + (7/3));	// 몫
		System.out.println("7%3 = " + (7%3));	// 나머지
		
		// 정수 (+, -, *, /, %, ^) 정수 = 정수
		System.out.println("\n7/3 = "+(7/3)); // 2
		System.out.println("\n7/3.0 = "+(7/3.0)); // 2.33333...		실수와 정수 연산 결과 실수
		System.out.println("\n7.0/3.0 = "+(7./3.0)); // 2.33333...	실수와 실수 연산 결과 실수
	}
}
//*/
/*
package ex03.operator;

// 최단산쉬관논삼대콤 순서로 우선 연산된다.
public class MainEntry {
	public static void main(String[] args) {
		// 단항연산자: 증감 ==> ++, --, ~, ...
		int x = -7, y;
		
		y = ~x; // 비트부정: -(원래값 + 1) << 출력결과
		System.out.println("x = "+ x + "\ty = " + y);
	}
}
//*/
/*
package ex03.operator;

// 최단산쉬관논삼대콤 순서로 우선 연산된다.
public class MainEntry {
	public static void main(String[] args) {
		// 단항연산자: 증감 ==> ++, --, ~, ...
		int x = 10, y;
		
//		y = x++; // 후위연산: 변수보다 연산이 뒤에 있는 연산. 대입 먼저 연산 나중
		y = ++x; // 전위연산: 변수보다 연산이 앞에 있는 연산. 연산 먼저 대입 나중
		System.out.println("x = "+ x + "\ty = " + y);
		
		
//		System.out.println(3+4*5);	//23	최우선연산자: (), [], .
//		System.out.println((3+4)*5);//35
	}
}
//*/