package ex04.DI;

public class MyBean {

	public MyBean() {
		System.out.println("Default");
	}
	
	public MyBean(String name) {
		System.out.println("overloading: " + name);
	}
}
