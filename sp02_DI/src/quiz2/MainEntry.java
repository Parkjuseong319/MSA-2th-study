package quiz2;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("quiz2/applicationContext.xml");

		Student st = context.getBean("student", Student.class);
		Worker wk = context.getBean("worker", Worker.class);
		Scanner sc = new Scanner(System.in);
		System.out.print("input student or worker: ");
		String str = sc.next();

		if (str.equals("student")) {
			st.input();
			st.output();
		}else {
			wk.input();
			wk.output();
		}
		sc.close();
	}
}
