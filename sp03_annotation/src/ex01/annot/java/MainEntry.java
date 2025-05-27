package ex01.annot.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Cats catInfo = context.getBean("catsInfo", Cats.class);
		catInfo.getMyCatsInfo();
		
		MyCats cats = context.getBean("cat2", MyCats.class);
		catInfo.setMyCats(cats);
		catInfo.getMyCatsInfo();
	}
}
