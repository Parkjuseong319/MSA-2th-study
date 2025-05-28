package ex05.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("ex05/aop/appCtx.xml");
		
		ICalc proxyCalc = context.getBean("proxy", ICalc.class);
		System.out.println(proxyCalc.add(1, 3));
		System.out.println(proxyCalc.mul(1, 3));
		System.out.println(proxyCalc.sub(13, 5, 2));
	}
}
