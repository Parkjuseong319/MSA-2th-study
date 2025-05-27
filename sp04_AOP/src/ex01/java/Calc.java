package ex01.java;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class Calc {
	
	public int add(int x, int y) {
		
		Log log = LogFactory.getLog(this.getClass());
		
		StopWatch sw = new StopWatch();
		sw.start(); 	// �ð� ���� ����
		log.info("Ÿ�̸� ����");
		
		int result = x + y;		// �ٽ�(����, �ְ�) �Ǵ��ڵ�
		
		sw.stop();		// �ð� ���� ��
		log.info("Ÿ�̸� ����");
		
		log.info("[TimerLog] Method: add");
		log.info("[TimerLog] process Time " + sw.getTotalTimeMillis());	// �۾��� �ɸ��ð�
		
		return result;
	}
	
	public int mul(int x, int y) {
		
		Log log = LogFactory.getLog(this.getClass());
		
		StopWatch sw = new StopWatch();
		sw.start(); 	// �ð� ���� ����
		log.info("Ÿ�̸� ����");
		
		int result = x * y;		// �ٽ�(����, �ְ�) �Ǵ��ڵ�
		
		sw.stop();		// �ð� ���� ��
		log.info("Ÿ�̸� ����");
		
		log.info("[TimerLog] Method: mul");
		log.info("[TimerLog] process Time " + sw.getTotalTimeMillis());	// �۾��� �ɸ��ð�
		
		return result;
	}
}
