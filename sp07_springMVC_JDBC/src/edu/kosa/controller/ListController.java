package edu.kosa.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.kosa.model.DeptDAO;

@Controller
public class ListController {
	
	@Autowired
	private DeptDAO deptDAO;	// db 연결 관련. 이 인터페이스를 implements한 클래스에서 jdbcTemplate가 연결되어있기 때문
	
	@RequestMapping("/list.do")
	public String list(Model model) {
		List list = deptDAO.listDept();
		
		model.addAttribute("list", list);
		return "list";
	}
	
	@RequestMapping("/hello.do")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("greeting", getGreeting());
		mav.setViewName("hello");
		return mav;
	}
	
	public Object getGreeting() {
		
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		if(hour >= 6 && hour <= 11) {
			return "좋은아침";
		}else if(hour >=12 && hour <= 15) {
			return "점심시간";
		}else if(hour >= 18 && hour <= 20) {
			return "퇴근";
		}
		
		return "Hello world";
	}
}
