package ex04.DI.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class MonitorViewer {

	// 1. 필드에 적용
//	@Autowired
	private Recorder recorder; // has-a 관계

	// 2. setter method를 통한 자동 주입
	@Autowired
	public void setRecorder(Recorder recorder) { // DI
		this.recorder = recorder;
	}

	public Recorder getRecorder() {
		return recorder;
	}

	// 3. 일반 메서드
//	@Autowired
	public void userMethod(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("사용자(일반) 메서드 이용한 자동 주입");
	}

	//4. 생성자 함수를 이용한 주입
	@Autowired
	public MonitorViewer(Recorder recorder) { // DI this.recorder = recorder;
		System.out.println("나는 생성자 함수 이용한 자동 주입");
	}

//	public MonitorViewer() { }

	public void print() {
		System.out.println("user method 주입: " + this.recorder);
		System.out.println("setter method");
		recorder.show();
	}
}
