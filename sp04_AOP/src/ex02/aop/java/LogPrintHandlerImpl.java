package ex02.aop.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPrintHandlerImpl implements InvocationHandler {

	private Object target;

	public LogPrintHandlerImpl(Object target) { // DI
		this.target = target;
	}

	// �������α׷� ����
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("invoke method start-------");
		// ���� ���� ����
		Log log = LogFactory.getLog(this.getClass());

		StopWatch sw = new StopWatch();
		sw.start(); // �ð� ���� ����
		log.info("Ÿ�̸� ����");
		
		// main ���� ����
		int result = (int)method.invoke(target, args);
		
		////////////////
		
		sw.stop();		// �ð� ���� ��
		log.info("Ÿ�̸� ����");
		
		log.info("[TimerLog] Method: " + method.getName());
		log.info("[TimerLog] process Time " + sw.getTotalTimeMillis());	// �۾��� �ɸ��ð�

		return result;
	}

}
