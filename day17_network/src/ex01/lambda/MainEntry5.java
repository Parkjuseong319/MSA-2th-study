package ex01.lambda;

@FunctionalInterface	// 메서드 하나만 있는 인터페이스에 적용하는 어노테이션
interface Message{
	void something(int x, int y);		// void, parameter O
	
}

@FunctionalInterface
interface Talk {
	void something(String x, String y);
}

class Person{
	public void greeting(Message msg) {
		msg.something(3, 5);
	}
	
	public void greeting(Talk msg) {
		msg.something("Hello", "MSA-2th");
	}
}

public class MainEntry5 {
	public static void main(String[] args) {
		 Person p = new Person();
		 
		 p.greeting(new Message() {	// 일반적이 형태
			@Override
			public void something(int x, int y) {
				System.out.println("only parameter O Hello");
				System.out.println("x = " + x + ", y = " + y);
			}
		});
		System.out.println("------------------------------------");
		
		char ch = 'K';
		
//		p.greeting((x, y) -> {	// error. overloading때문에 타입이 애매해서 타입 명시적으로 해야한다.
//		p.greeting((String x, String y) -> {	
		p.greeting((int x, int y) -> {	
			System.out.println("Lambda parameter O Hello");
			System.out.println("x = " + x + ", y = " + y);
//			ch = 'P';		// lambda 안에서 값 변경할 수 없다.
			System.out.println(ch); 	// 출력은 가능
			
			num = 500;	// static member는 lambda안에서 값 변경 할 수 있다.
			System.out.println(num);
		});
	}
	
	static int num = 30;
	
}