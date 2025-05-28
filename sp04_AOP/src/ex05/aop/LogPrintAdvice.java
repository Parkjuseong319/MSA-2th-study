package ex05.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPrintAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Around Service invoke() start..........");
		
		// ��������
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("Timer start");
		
		/// main aspect code
		Object result = invocation.proceed();		// �� ���ɻ� �Լ� ȣ��
		///--------------------
		
		sw.stop();
		log.info("Timer stop");
		
		log.info("[TimerLog] Method: " + invocation.getMethod()); 	// ������ �޼����
		System.out.println("[TimerLog] args: " + Arrays.toString(invocation.getArguments()));
		log.info("[TimerLog] process time: " + sw.getTotalTimeMillis());
		return result;
	}

}
