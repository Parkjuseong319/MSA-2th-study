package ex04.apiObject;

class Rectangle {
	int x, y;

	public void disp() {
		System.out.println(x + ", " + y);
	}

	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + "]";
	}

	
	
//	@Override
//	public String toString() {
//		return x + ", 777 " + y;
//	}

//	public String toString() {
//		return x + ", " + y;
//	}
	
}

public class ToStringMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		System.out.println(r);
		System.out.println(r.toString());
//		r.disp();
	}
}
