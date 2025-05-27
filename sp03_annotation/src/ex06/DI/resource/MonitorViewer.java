package ex06.DI.resource;

import javax.annotation.Resource;

public class MonitorViewer {

	private Recorder recorder;
	
	@Resource(name="x")
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
		
		recorder.show();
		System.out.println(recorder);
		System.out.println("@Resource ¡÷¿‘");
	}
}
