package ex05.DI.qualifier;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MonitorViewer {
	private Recorder recorder;	// has-a
	
//	@Inject		// javax ���̺귯���� �ִ� ������̼����� autowired �� ���� ����� �����Ѵ�.
//	@Autowired(required = false)		// default value = true
//	public MonitorViewer(@Qualifier("key") Recorder recorder) {
//		this.recorder = recorder;
//		System.out.println("@Autowired �ڵ� ����");
//	}
	
	@Autowired
//	@Qualifier("recorder3")		// <qualifier /> ��Ұ� ����� id ������ ���� �����ϴ�.
//	@Qualifier("rr1")		// name �����ε� ȣ�� �����ϴ�.
//	@Qualifier("cord")		// <qualifier value="cord" /> ��ҷ� �ҷ���
	public void setRecorder(@Qualifier("key") Recorder  recorder) {
		this.recorder = recorder;
		System.out.println("setRecorder method call");
	}

	public void show() {
		recorder.show();
		System.out.println("MonitorViewer show method call");
	}
}
