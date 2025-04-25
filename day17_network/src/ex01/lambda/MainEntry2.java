//package ex01.lambda;
//
//interface Message{
//	int something();		// int return type, parameter X
//}
//
//class Person{
//	public void greeting(Message msg) {
//		int su = msg.something();
//		System.out.println("Message interface something: " + su);
//	}
//}
//
//public class MainEntry2 {
//	public static void main(String[] args) {
//		 Person p = new Person();
//		 
//		 p.greeting(new Message() {	// 일반적이 형태
//			@Override
//			public int something() {
//				System.out.println("return type Hello");
//				System.out.println("수고 많았습니다");
//				return 100;
//			}
//		});
//		System.out.println("------------------------------------");
//		p.greeting(() -> {
//			System.out.println("Lambda return type Hello");
//			System.out.println("폭싹 속았수다");
//			return 200;
//		});
//	}
//}
