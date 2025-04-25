package quiz.Abstract;

public class Bus extends Trans {

	@Override
	public void start() {
		this.speed = 70;
		System.out.println("버스 출발합니다. 속도 : " + speed + "km/h");

	}

	@Override
	public void stop() {
		this.speed = 0;
		System.out.println("이번 정류장에서 정차합니다. 속도: " + speed + "km/h");
	}

}
