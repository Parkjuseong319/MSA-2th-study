package quiz.Interface;

public class Subway implements Trans {

	@Override
	public void start() {
		System.out.println("전철 출발");
	}

	@Override
	public void stop() {
		System.out.println("전철 멈춰");
	}

}
