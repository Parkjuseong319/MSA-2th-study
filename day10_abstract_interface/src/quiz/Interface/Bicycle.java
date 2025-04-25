package quiz.Interface;

public class Bicycle implements Trans {

	@Override
	public void start() {
		System.out.println("나는야 라이더 출발");
	}

	@Override
	public void stop() {
		System.out.println("쓰러진 라이더.. 정차..");
	}

}
