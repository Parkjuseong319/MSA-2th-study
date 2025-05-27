package ex06.DI.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		String config = "classpath:ex06/DI/resource/resourceContext.xml";
		ApplicationContext context = new GenericXmlApplicationContext(config);
		
		MonitorViewer viewer = context.getBean("viewer", MonitorViewer.class);
		
	}
}
