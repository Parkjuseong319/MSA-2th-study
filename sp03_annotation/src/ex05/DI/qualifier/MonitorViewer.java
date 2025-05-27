package ex05.DI.qualifier;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MonitorViewer {
	private Recorder recorder;	// has-a
	
//	@Inject		// javax 라이브러리에 있는 어노테이션으로 autowired 와 같은 기능을 제공한다.
//	@Autowired(required = false)		// default value = true
//	public MonitorViewer(@Qualifier("key") Recorder recorder) {
//		this.recorder = recorder;
//		System.out.println("@Autowired 자동 주입");
//	}
	
	@Autowired
//	@Qualifier("recorder3")		// <qualifier /> 요소가 없어야 id 값으로 매핑 가능하다.
//	@Qualifier("rr1")		// name 값으로도 호출 가능하다.
//	@Qualifier("cord")		// <qualifier value="cord" /> 요소로 불러옴
	public void setRecorder(@Qualifier("key") Recorder  recorder) {
		this.recorder = recorder;
		System.out.println("setRecorder method call");
	}

	public void show() {
		recorder.show();
		System.out.println("MonitorViewer show method call");
	}
}
