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

	// �ʱ�ȭ �޼���(�̺�Ʈ�� ���������� ������ �ڵ�ȣ�� : ȣ�����)
	// InitializingBean ���� ������
	// afterPropertiesSet: property injection 
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Client.afterPropertiesSet() ����");
		
	}
	
	// �Ҹ�޼���(�̺�Ʈ�� ���������� ������ �ڵ�ȣ��: ȣ�����)
	// DisposableBean ���� ������
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Client.destroy() ����");
	}

}
