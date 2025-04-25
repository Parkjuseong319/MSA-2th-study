//*
package ex03.operator;

//최단산쉬관논삼대콤
public class OperatorTest {
	public static void main(String[] args) {
		// 관계연산자: >, <, >=, <=, ==(같다), !=(같지않다)
		
		int x = 20;
		int y = 20;
		
		if(x!=y) System.out.println("not same");
		else System.out.println("same");
		
		if(x==y) System.out.println("same2");
		else System.out.println("not same2");
		
		
	}
}
//*/
/*
package ex03.operator;

//최단산쉬관논삼대콤
public class OperatorTest {
	public static void main(String[] args) {
		// shift 연산자: <<, >>, <<<, >>>
		
		int x = 8, result;
//		result = x << 2; // left shift: 원래값 *2^bit수 ==> 8 * 2^2 = 32
		//x값을 좌측으로 2비트 이동한다는 의미
		
		result = x >> 3; // right shift: 원래값 / 2^bit수 ==> 8/2^3 = 1
		System.out.println(result);
		
		
	}
}
//*/