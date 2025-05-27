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
		// 위 코드는 싱글톤을 적용하기 전이라 주소가 다 다른 객체로 생성된다.
		
		Singleton single = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		Singleton single3 = Singleton.getInstance();
		
		System.out.println(single + ", " + single2 + ", " + single3);
		System.out.println(single.hashCode() + ", " + single2.hashCode() + ", " + single3.hashCode());
		// 싱글톤 패턴 적용에 따라 같은 주소인 객체로 생성된다.
		여기까진 자바기반 코드
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
		  1. 컨테이너 안에 있는 bean 객체를 리턴(new 아니다.)
		  2. return type은 Object 이다.(타입에 맞게 캐스팅 필요)
		  3. 스프링 컨테이너 안에 객체들은 default singleton
		  4. 예외적으로 getBean()이 new 라고 할 수 있다.(new는 거의 쓰지 않는다)
		  
		 */
		
	}
}
