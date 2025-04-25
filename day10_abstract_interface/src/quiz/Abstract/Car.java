package quiz.Abstract;

public class Car extends Trans {

	@Override
	public void start() {
		this.speed = 85;
		System.out.println("안전벨트 매고 브레이크 밟고 시동 키고 출발. 속도: "+ speed + "km/h");
	}

	@Override
	public void stop() {
		this.speed = 0;
		System.out.println("멈춰! 속도: " );
	}

}
