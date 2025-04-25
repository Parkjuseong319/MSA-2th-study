package ex03.operator;

//최단산쉬관논삼대콤
public class OperatorTest2 {
	
	public static void main(String[] args) {
		//논리연산자
		System.out.println(4&7);
		System.out.println(4|7);
		System.out.println(4^7);
		
		int x = 10, y = 20, z = 30;
		boolean flag = false;
		
		//and 연산자에서 앞이 참이면 뒤에 연산도 이어서 한다. 하지만 앞에서 거짓이면 연산 수행을 멈추고 false값 반환
//		flag = (x < y) && (y < z);	
		flag = (x < y) || (y < z);	
		System.out.println(flag);

//		flag = (x > y) && (y > z);	
		flag = (x < y) || (y > z);	// or 연산자는 앞에서 참일 경우 연산 수행을 멈추고 true 값 반환한다.
		System.out.println(flag);
	}
}
