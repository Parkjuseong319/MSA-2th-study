package ex05.DI.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("ex05/DI/qualifier/applicationContext.xml");
		
		MonitorViewer viewer = context.getBean("viewer", MonitorViewer.class);
		viewer.show();
	}
}
