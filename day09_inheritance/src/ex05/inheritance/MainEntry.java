package ex05.inheritance;
// private < default < protected < public
class Point2{		// 부모클래스
	protected int x,y;		// protected = 상속받은 클래스에서 가져올 수 있는 접근제어자
							// default = 같은 패키지에 있을때 사용 가능하게 하는 접근제어자
}

class Circle2 extends Point2{		// 자손클래스
	int r;
	
	public void disp() {
		System.out.println(x + ", " + y + "," + r);
	}
}

public class MainEntry {
	public static void main(String[] args) {
		Circle2 c = new Circle2();
		
	}
}
