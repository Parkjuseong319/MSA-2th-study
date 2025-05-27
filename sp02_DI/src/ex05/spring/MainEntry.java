package ex05.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:ex05/spring/applicationContext.xml");
		
		ArticleService service = context.getBean("articleService", ArticleService.class);
		Article article = context.getBean("article", Article.class);
		
		service.write(article);
		
	}
}
