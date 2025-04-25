package ex02.method;

// 4. 매개변수 있고, 리턴타입 있는 경우

public class MethodEx2 {
	
//	public static int name(int x) {
//		System.out.println("x: " + x);
//		return x;
//	}
	
	public static String name(int x, String irum) {
		System.out.println("x: " + x);
		return irum;
	}
	
	public static int value(int x, int y) {
		return x + y;
	}
	
	public static String display(int x, String name) {
		for (int i = 0; i < x; i++) {
			System.out.print(name + "\t");
		}
		System.out.println();
		return name;
	}
	
//	public static int value(int x, int y) {
//		return x + y + 2.3;		// return 하는 타입이 함수 타입보다 우선순위가 높다.
//	}
	
	public static void main(String[] args) {
		System.out.println(display(10, "zoo"));
		
		String triangle = display(15,"▲");
		System.out.println(triangle);
		
//		System.out.println(value(1,2, 12.34));
		System.out.println(value(1,2));
		
		String str = name(10, "zoo");
		System.out.println(str);
		
		
//		System.out.println(name(23));
//		int num = name(33);
//		System.out.println(num);
		
	}
}
