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

	// 보조프로그램 구현
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("invoke method start-------");
		// 보조 업무 구현
		Log log = LogFactory.getLog(this.getClass());

		StopWatch sw = new StopWatch();
		sw.start(); // 시간 측정 시작
		log.info("타이머 시작");
		
		// main 관심 실행
		int result = (int)method.invoke(target, args);
		
		////////////////
		
		sw.stop();		// 시간 측정 끝
		log.info("타이머 정지");
		
		log.info("[TimerLog] Method: " + method.getName());
		log.info("[TimerLog] process Time " + sw.getTotalTimeMillis());	// 작업에 걸린시간

		return result;
	}

}
