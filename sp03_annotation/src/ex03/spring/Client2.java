package ex03.spring;

public class Client2 {	// implements InitializingBean, DisposableBean
	
	private String host;

	public void setHost(String host) {
		this.host = host;
	}
	
	public void connect() throws Exception{
		System.out.println("client2.connect() 실행 - 초기화 메서드");
	}
	
	public void send() {
		System.out.println("Client.send() call: " + host);
		
	}
	
	public void close() throws Exception{
		System.out.println("Client2.close() call - 소멸 메서드");
	}

}
