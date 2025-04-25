package quiz.Interface;

public class Plane implements Trans {

	@Override
	public void start() {
		System.out.println("비행기를 타고 가던 너~");
	}

	@Override
	public void stop() {
		System.out.println("그 비행기는 멈춰버렸어");
	}

}
