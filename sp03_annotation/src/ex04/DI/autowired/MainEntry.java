package ex04.DI.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("ex04/DI/autowired/autowiredContext.xml");
		
		MonitorViewer viewer = context.getBean("viewer", MonitorViewer.class);
		viewer.print();
	}
}
