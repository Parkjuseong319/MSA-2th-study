package ex03.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigClient2.class);
		
		Client2 c = context.getBean("client", Client2.class);
		c.send();
		
		context.close();
	}
}
