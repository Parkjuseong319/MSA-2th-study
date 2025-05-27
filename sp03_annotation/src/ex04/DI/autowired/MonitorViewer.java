package ex04.DI.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class MonitorViewer {

	// 1. �ʵ忡 ����
//	@Autowired
	private Recorder recorder; // has-a ����

	// 2. setter method�� ���� �ڵ� ����
	@Autowired
	public void setRecorder(Recorder recorder) { // DI
		this.recorder = recorder;
	}

	public Recorder getRecorder() {
		return recorder;
	}

	// 3. �Ϲ� �޼���
//	@Autowired
	public void userMethod(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("�����(�Ϲ�) �޼��� �̿��� �ڵ� ����");
	}

	//4. ������ �Լ��� �̿��� ����
	@Autowired
	public MonitorViewer(Recorder recorder) { // DI this.recorder = recorder;
		System.out.println("���� ������ �Լ� �̿��� �ڵ� ����");
	}

//	public MonitorViewer() { }

	public void print() {
		System.out.println("user method ����: " + this.recorder);
		System.out.println("setter method");
		recorder.show();
	}
}
