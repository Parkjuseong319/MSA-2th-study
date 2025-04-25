//package ex01.lambda;
//
//interface Message{
//	int something(int x);		// int return type, parameter O
//}
//
//class Person{
//	public void greeting(Message msg) {
//		int su = msg.something(20);
//		System.out.println("Message interface something: " + su);
//	}
//}
//
//public class MainEntry3 {
//	public static void main(String[] args) {
//		 Person p = new Person();
//		 
//		 p.greeting(new Message() {	// 일반적이 형태
//			@Override
//			public int something(int x) {
//				System.out.println("return type, parameter O Hello");
//				System.out.println("수고 많았습니다");
//				return x+100;
//			}
//		});
//		System.out.println("------------------------------------");
////		p.greeting((x) -> {
//		p.greeting(x -> {	// 자료형 안써도 된다. 매개변수 하나라면 괄호가 필요 없다.
//			System.out.println("Lambda return type, parameter O Hello");
//			System.out.println("폭싹 속았수다");
//			return x + 500;
//		});
//	}
//}
