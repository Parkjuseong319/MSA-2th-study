package ex04.Interface;

interface A{	// interface - abstract method, final field만 갖는다.
	int x = 90;
	final int y = 777;
	char ch = 'A';
	
	// 추상 메서드. abstract 생략 가능 - interface가 추상메서드만 가지기 때문
	public void show();
	public abstract void disp();
//	public void view() {   } 		// error
	
}	// A end

interface B{
	void view();
}	// B end

interface C {
	String name = "zoo";
	public void draw();
}	// C end

interface D extends B{
	void dview();
}
/////////////////////////////////////////////////////////////////////
class Rect implements D{

	@Override
	public void view() {	// B에 있던 추상메서드. 
		
	}

	@Override
	public void dview() {	// D에 있던 추상메서드.
		
	}
	
	public int plus(int x, int y) {
		return x + y;
	}
	
}	// Rect end
/////////////////////////////////////////////////////////////////////////////

class Shape{
	
}	// Shape end

class Circle implements C{

	@Override
	public void draw() {
//		name = "park";		// final 이라 상수. 값 변경 불가
		
		System.out.println(name + "님 이네요.");
	}
	
}	// Circle end

/////////////////////////////////////////////////////////////////
class Multi extends Shape implements B, C, A{	// 자바 컴파일러에선 클래스 옆에 클래스가 적혀있고 그 뒤에 인터페이스가 있어야 컴파일 가능.
	// 그러므로 클래스 먼저 상속 후 인터페이스 구현

	@Override
	public void show() {	//A
		System.out.println("show method call~~");
	}

	@Override
	public void disp() {	//A
		System.out.println("disp method call~~");
	}

	@Override
	public void draw() {	// C
		System.out.println("draw method call~~");
	}

	@Override
	public void view() {	// B
		System.out.println("view method");
		
	}
	
}	// Multi class end

public class MainEntry {
	public static void main(String[] args) {
//		A a = new A();		// interface라서 객체로 생성 불가
		Multi m = new Multi();		// 속한 interface의 메서드들이 다 표시
		m.show();
		
		B b = new Multi();			// B에 속한 추상메서드만 가져올 수 있다.
		b.view();
		
		
		
	}
}
