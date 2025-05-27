package ex04.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		/*
		MyBean mybean = new MyBean();
		MyBean mybean2 = new MyBean("zoo");
		MyBean mybean3 = new MyBean();
		
		System.out.println(mybean + ", " + mybean2 + ", " + mybean3);
		System.out.println(mybean.hashCode() + ", " + mybean2.hashCode() + ", " + mybean3.hashCode());
		// �� �ڵ�� �̱����� �����ϱ� ���̶� �ּҰ� �� �ٸ� ��ü�� �����ȴ�.
		
		Singleton single = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		Singleton single3 = Singleton.getInstance();
		
		System.out.println(single + ", " + single2 + ", " + single3);
		System.out.println(single.hashCode() + ", " + single2.hashCode() + ", " + single3.hashCode());
		// �̱��� ���� ���뿡 ���� ���� �ּ��� ��ü�� �����ȴ�.
		������� �ڹٱ�� �ڵ�
		*/
		
		ApplicationContext context = new GenericXmlApplicationContext("ex04/DI/applicationContext.xml");
		
		MyBean mybean = context.getBean("myBean", MyBean.class);
		MyBean mybean2 = (MyBean)context.getBean("myBean2");
		MyBean mybean3 = (MyBean)context.getBean("obj");
		
		System.out.println(mybean);		//ex04.DI.MyBean@2cd76f31
		System.out.println(mybean2);	//ex04.DI.MyBean@367ffa75
		System.out.println(mybean3);	//ex04.DI.MyBean@2cd76f31
		
		Singleton s = context.getBean("single", Singleton.class);
		Singleton s2 = context.getBean("single", Singleton.class);
		
		System.out.println(s + " , " + s2);
		//ex04.DI.Singleton@49438269 , ex04.DI.Singleton@49438269
		
		/* 
		 getBean()
		  1. �����̳� �ȿ� �ִ� bean ��ü�� ����(new �ƴϴ�.)
		  2. return type�� Object �̴�.(Ÿ�Կ� �°� ĳ���� �ʿ�)
		  3. ������ �����̳� �ȿ� ��ü���� default singleton
		  4. ���������� getBean()�� new ��� �� �� �ִ�.(new�� ���� ���� �ʴ´�)
		  
		 */
		
	}
}
