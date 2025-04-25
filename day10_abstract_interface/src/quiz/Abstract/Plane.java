package quiz.Abstract;

public class Plane extends Trans {

	@Override
	public void start() {
		this.speed = 680;
		System.out.println("이륙 시작합니다. 속도 : " + speed + "km/h");
	}

	@Override
	public void stop() {
		this.speed = 0;
		System.out.println("착륙하겠습니다. 속도: " + speed + "km/h");
	}

}
