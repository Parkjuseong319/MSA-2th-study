package ex03.operator;

//최단산쉬관논삼대콤
public class OperatorTest3 {
	
	public static void main(String[] args) {
		//삼항 연산자: (조건)? 참:거짓;
		int a, b, c, d;
		a = b = c = d = 10;
		int su = -3;
		String str;
		
		str = ((su%2 != 0) && (su < 0))? "홀수 & 음수" : ((su%2 != 0) && (su > 0))? "홀수&양수":"짝수&양수";
		
		System.out.println(su + " = " + str);	// 결과: -3 = 홀수 & 음수
		
	}
}
/*
package ex03.operator;

//최단산쉬관논삼대콤
public class OperatorTest3 {
	
	public static void main(String[] args) {
		//삼항 연산자: (조건)? 참:거짓;
		int x = 3, y = 5, z = 7, result;
		
//		result = (x > y) ? x : y;
		result = (x > y) ? x : (y > z)?y:z;		// 연속적인 삼항 연산자 가능하다.
		System.out.println(result);
		
	}
}
//*/
/*
package ex03.operator;

//최단산쉬관논삼대콤
public class OperatorTest3 {
	
	public static void main(String[] args) {
		//삼항 연산자
		
		int su = 10;
		String str;
		
//		str = (su % 2 == 0)? "even" : "odd";		// 결과: even
		str = (su % 2 != 0)? "홀수" : "짝수";			// 결과: 짝수
		
		System.out.println(str);

	}
}
//*/