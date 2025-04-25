package ex00.Instanceof;

class A{ int a; }

class B extends A{ int b; }

public class MainEntry {
	public static void main(String[] args) {
		A a = new A();
//		B aa = new A();		// 상속이 반대로는 어렵다.
		B b = new B();
		A bb = new B();
		
		// instanceof - 객체확인 하는 함수. 앞에 있는 객체가 뒤에있는 객체로 변환이 되는지 안되는지 boolean type으로 return
		System.out.println("a instanceof A: " + (a instanceof A));	// 결과값 - true
		System.out.println("b instanceof A: " + (b instanceof A));	// 결과값 - true
		System.out.println("a instanceof B: " + (a instanceof B));	// 결과값 - false
		System.out.println("a instanceof B: " + (b instanceof B));	// 결과값 - true
	}
}
