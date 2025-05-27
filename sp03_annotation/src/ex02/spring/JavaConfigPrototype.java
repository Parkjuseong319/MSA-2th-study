package ex02.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigPrototype {
	
	@Bean
	public Client client() {
		Client c = new Client();
		c.setHost("server 2222");
		
		return c;
	}
}
