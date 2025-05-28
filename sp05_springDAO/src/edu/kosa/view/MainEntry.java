package edu.kosa.view;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.kosa.dao.di.UserDAO;
import edu.kosa.model.UserVO;

public class MainEntry {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("appCtx.xml");
		
		UserDAO dao = context.getBean("dao", UserDAO.class );
		dao.menu();
		Scanner sc = new Scanner(System.in);
		
		
		switch (sc.nextInt()) {
		case 1:
			UserVO vo = new UserVO();
			System.out.println("user id = "); vo.setId(sc.next());
			System.out.println("user name = "); vo.setName(sc.next());
			System.out.println("user password = "); vo.setPassword(sc.next());
			
			dao.insert(vo);
			System.out.println(vo.getId() + "추가 성공");
			System.out.println("---------------------");
			break;
		case 2: 
			dao.selectAll();
			break;
		case 3:
			break;
			default: System.out.println("해당 번호가 없습니다. 확인 요망");
		}
		
	}
}
