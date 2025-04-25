package quiz.Abstract;

public abstract class Trans {	// 운송수단.
	protected int speed = 5;
	
	public abstract void start();
	public abstract void stop();

	public String name(String name) {
		return name;
	}
	
	public void show(String name) {
		System.out.println(name + "동작");
	}
}
