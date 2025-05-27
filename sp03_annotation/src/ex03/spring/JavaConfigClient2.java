package ex03.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration		// ���� �������� �˷��ش�
public class JavaConfigClient2 {	// xml ��� ������ �ƴ� �ڹ� ��� ����
	
	@Bean
	public Client2 client() {
		Client2 c2 = new Client2();
		c2.setHost("server!");
		return c2;
	}
	
	
}
