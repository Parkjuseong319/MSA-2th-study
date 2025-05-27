package ex01.annot.java;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {	// Configuration ������̼����� ���� xml �������� ������ �ϰ� �ȴ�.
	
	@Bean
	public MyCats cat1() {	// MyCats cat1 = new MyCats(); / <bean id="cat1" class="ex01.anno.java.MyCats"/>
		ArrayList<String> hobbys = new ArrayList();
		hobbys.add("�չߵ��");
		hobbys.add("�߱���");
		hobbys.add("����");
		
		MyCats myCats = new MyCats("����", 12, hobbys);
		myCats.setColor("white");
		myCats.setWeight(3.0);
		
		return myCats;
	}
	
	@Bean
	public MyCats cat2() {	
		ArrayList<String> hobbys = new ArrayList();
		hobbys.add("��ũ");
		hobbys.add("�ڲ���");
		hobbys.add("�Ͼ���");
		
		MyCats myCats = new MyCats("����", 3, hobbys);
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
