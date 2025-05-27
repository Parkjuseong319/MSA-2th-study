package ex04.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		// 컨테이너 생성
		ApplicationContext context = new ClassPathXmlApplicationContext("ex04/aop/ctx.xml");
		
		 IMessageBean msg = context.getBean("messageBeanImpl", IMessageBean.class);
		 msg.sayHello();
		 System.out.println("=======================");
		 msg.engHello();
		 
		 IBookBean book = context.getBean("bookBeanImpl", IBookBean.class);
		 book.testHello("MSA2");
		 System.out.println();
		 book.korHello();
	}
}
