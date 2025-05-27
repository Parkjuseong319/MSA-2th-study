package ex03.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		String config = "classpath:ex03/aop/applicationContext.xml";
		ApplicationContext context = new GenericXmlApplicationContext(config);
		
		// Proxy 만들고 객체를 넘긴다. 필요한 객체 생성 작업은 xml에서
		Calc proxy = context.getBean("proxy", Calc.class);
		System.out.println(proxy.add(3, 5));
		System.out.println(proxy.sub(7, 5));
		System.out.println(proxy.mul(4, 5));
	}
}
