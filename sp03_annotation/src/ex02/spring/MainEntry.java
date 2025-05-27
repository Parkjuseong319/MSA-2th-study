package ex02.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigPrototype.class);
		
		Client c = context.getBean("client", Client.class);
		c.setHost("server!");
		c.send();
		
		Client c2 = context.getBean("client", Client.class);
		c2.setHost("defaultHost!");
		c2.send();
		
		context.close();
	}
}
