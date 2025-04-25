package quiz.Interface;

public class Bus implements Trans {

	@Override
	public void start() {
		System.out.println("버스 출발");
	}

	@Override
	public void stop() {
		System.out.println("버스 멈춰");
	}

}
