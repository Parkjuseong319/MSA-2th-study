package ex03_DI.copy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ex03_DI/copy/appCtx.xml");
		IRecordViewImpl view = context.getBean("v", IRecordViewImpl.class);
//		view.input();
		view.print();
		
		
	}
}
