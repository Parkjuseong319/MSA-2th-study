package quiz.Abstract;

public class Subway extends Trans {

	@Override
	public void start() {
		this.speed = 200;
		System.out.println("출발. 속도: " + speed + "km/h");
	}

	@Override
	public void stop() {
		this.speed = 0;
		System.out.println("이번 역에서 정차. 속도: " + speed + "km/h");

	}

}
