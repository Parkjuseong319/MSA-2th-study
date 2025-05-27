package ex03.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration		// 설정 파일임을 알려준다
public class JavaConfigClient2 {	// xml 기반 설정이 아닌 자바 기반 설정
	
	@Bean
	public Client2 client() {
		Client2 c2 = new Client2();
		c2.setHost("server!");
		return c2;
	}
	
	
}
