package ex04.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

// xml 기반 POJO 방식의 AspectJ를 이용한 AOP 방법
public class LoggingAdvice {
	
//	Around 방식의 사전/사후 처리 AOP around 방식으로 할때
//	인수는 ProceddingJoinPoint, 리턴 - Object 필수
	public Object around(ProceedingJoinPoint point) throws Throwable{
		
		String methodName = point.getKind();
		String methodName2 = point.getSignature().getName();
		
		System.out.println("[Log] methodName = " + methodName + ", methodName2 = " + methodName2 + "호출 되기전...");
		StopWatch sw = new StopWatch();
		sw.start(methodName);
		
		Object obj = point.proceed();
		
		sw.stop();
		System.out.println("[Log] " + methodName2 + "호출 완료");
		System.out.println("[Log] 실행시간: " + sw.getTotalTimeMillis());
		
		return obj;
	}

}
