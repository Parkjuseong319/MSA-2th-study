package ex01.java;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class Calc {
	
	public int add(int x, int y) {
		
		Log log = LogFactory.getLog(this.getClass());
		
		StopWatch sw = new StopWatch();
		sw.start(); 	// 시간 측정 시작
		log.info("타이머 시작");
		
		int result = x + y;		// 핵심(관심, 주가) 되는코드
		
		sw.stop();		// 시간 측정 끝
		log.info("타이머 정지");
		
		log.info("[TimerLog] Method: add");
		log.info("[TimerLog] process Time " + sw.getTotalTimeMillis());	// 작업에 걸린시간
		
		return result;
	}
	
	public int mul(int x, int y) {
		
		Log log = LogFactory.getLog(this.getClass());
		
		StopWatch sw = new StopWatch();
		sw.start(); 	// 시간 측정 시작
		log.info("타이머 시작");
		
		int result = x * y;		// 핵심(관심, 주가) 되는코드
		
		sw.stop();		// 시간 측정 끝
		log.info("타이머 정지");
		
		log.info("[TimerLog] Method: mul");
		log.info("[TimerLog] process Time " + sw.getTotalTimeMillis());	// 작업에 걸린시간
		
		return result;
	}
}
