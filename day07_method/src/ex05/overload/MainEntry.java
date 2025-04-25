package ex05.overload;

public class MainEntry {
	
	public static void plus(int x, int y) {
		System.out.println(x + y);
	}

	public static void plus(int x, int y, int z) {
		System.out.println(x + y + z);
	}
	
	public static void plus(double x, double y) {
		System.out.println(x + y);
	}
	

	public static void main(String[] args) {
		
	}
}
