package ex03.operator;

//최단산쉬관논삼대콤
public class OperatorTest4 {
	
	public static void main(String[] args) {
		// 대입 연산자: =, +=, -=, *=, /=, <<=, >>=, ...
		
		int x = 2, y = 3, result;
		
		result = x + y ;
		System.out.println(result); // 결과: 5
		
		x = x + y;
		System.out.println(x);		// 결과: 5
		x += y;
		System.out.println(x);		// 결과: 8
		
		x *= y;
		System.out.println(x);		// 결과: 24
		
		x = x + 1; // 같지만 다른표현 방식 x+=1;	 x++;
		System.out.println(x);		// 결과: 25
		
	}
}
