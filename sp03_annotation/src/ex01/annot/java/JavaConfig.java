package ex01.annot.java;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {	// Configuration 어노테이션으로 인해 xml 설정파일 역할을 하게 된다.
	
	@Bean
	public MyCats cat1() {	// MyCats cat1 = new MyCats(); / <bean id="cat1" class="ex01.anno.java.MyCats"/>
		ArrayList<String> hobbys = new ArrayList();
		hobbys.add("앞발들기");
		hobbys.add("뒹굴기");
		hobbys.add("낮잠");
		
		MyCats myCats = new MyCats("냥이", 12, hobbys);
		myCats.setColor("white");
		myCats.setWeight(3.0);
		
		return myCats;
	}
	
	@Bean
	public MyCats cat2() {	
		ArrayList<String> hobbys = new ArrayList();
		hobbys.add("윙크");
		hobbys.add("꾹꾹이");
		hobbys.add("하악질");
		
		MyCats myCats = new MyCats("나비", 3, hobbys);
		myCats.setColor("black");
		myCats.setWeight(2.3);
		
		return myCats;
	}
	@Bean
	public Cats catsInfo() {
		Cats cats = new Cats(this.cat1());
		return cats;
	}
}
