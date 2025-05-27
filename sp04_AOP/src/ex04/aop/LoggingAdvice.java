package ex04.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

// xml ��� POJO ����� AspectJ�� �̿��� AOP ���
public class LoggingAdvice {
	
//	Around ����� ����/���� ó�� AOP around ������� �Ҷ�
//	�μ��� ProceddingJoinPoint, ���� - Object �ʼ�
	public Object around(ProceedingJoinPoint point) throws Throwable{
		
		String methodName = point.getKind();
		String methodName2 = point.getSignature().getName();
		
		System.out.println("[Log] methodName = " + methodName + ", methodName2 = " + methodName2 + "ȣ�� �Ǳ���...");
		StopWatch sw = new StopWatch();
		sw.start(methodName);
		
		Object obj = point.proceed();
		
		sw.stop();
		System.out.println("[Log] " + methodName2 + "ȣ�� �Ϸ�");
		System.out.println("[Log] ����ð�: " + sw.getTotalTimeMillis());
		
		return obj;
	}

}
