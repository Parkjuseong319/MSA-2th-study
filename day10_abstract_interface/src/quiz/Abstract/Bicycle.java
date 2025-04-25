package quiz.Abstract;

public class Bicycle extends Trans {

	@Override
	public void start() {
		this.speed = 20;
		System.out.println("출발 속도: " + speed + "km/h");
	}

	@Override
	public void stop() {
		this.speed = 0;
		System.out.println("끼이이익! 속도: "+ speed + "km/h");
	}

}
