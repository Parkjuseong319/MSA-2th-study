package ex02.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Client implements InitializingBean, DisposableBean {
	
	private String defaulthost;
	private String host;
	
	public Client() {
		System.out.println("Client Default Constructor");
	}
	
	// constructor DI
	public Client(String defaulthost, String host) {
		super();
		this.defaulthost = defaulthost;
		this.host = host;
	}
	
	// setter DI
	public void setDefaulthost(String defaulthost) {
		this.defaulthost = defaulthost;
	}

	// setter DI
	public void setHost(String host) {
		this.host = host;
	}
	
	public void send() {
		System.out.println("Client.send() to: " + host);
	}

	// 초기화 메서드(이베트를 내부적으로 가지고 자동호출 : 호출시점)
	// InitializingBean 대한 구현부
	// afterPropertiesSet: property injection 
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Client.afterPropertiesSet() 실행");
		
	}
	
	// 소멸메서드(이벤트를 내부적으로 가지고 자동호출: 호출시점)
	// DisposableBean 대한 구현부
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Client.destroy() 실행");
	}

}
