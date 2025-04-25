package ex03.oop;

public class MainEntry {
	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.output();
		TV tv2 = new TV("green");
		tv2.output();
		TV tv3 = new TV(434);
		tv3.output();
		TV tv4 = new TV("white", 500);
		tv4.output();
	}
}
