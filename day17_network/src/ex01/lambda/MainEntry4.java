//package ex01.lambda;
//
//interface Message{
//	int something(int x, int y);		// int return type, parameter O
//}
//
//class Person{
//	public void greeting(Message msg) {
//		int su = msg.something(3, 5);
//		System.out.println("Message interface something: " + su);
//	}
//}
//
//public class MainEntry4 {
//	public static void main(String[] args) {
//		 Person p = new Person();
//		 
//		 p.greeting(new Message() {	// 일반적이 형태
//			@Override
//			public int something(int x, int y) {
//				System.out.println("return type, parameter O Hello");
//				System.out.println("x = " + x + ", y = " + y);
//				return x+y;
//			}
//		});
//		System.out.println("------------------------------------");
//		p.greeting((x, y) -> {	// 자료형 안써도 된다. 매개변수 2개 이상부턴 괄호 생략하면 안된다.
//			System.out.println("Lambda return type, parameter O Hello");
//			System.out.println("x = " + x + ", y = " + y);
//			return x + y + 100;
//		});
//	}
//}
