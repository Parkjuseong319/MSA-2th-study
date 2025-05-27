package ex04.DI;

public class Singleton {

	private Singleton() {	}
	
	private static Singleton instance = new Singleton();
	
	public static Singleton getInstance() {
		return instance;
	}
}
