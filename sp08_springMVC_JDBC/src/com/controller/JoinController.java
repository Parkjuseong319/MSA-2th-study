package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.MemberDAO;

@Controller
@RequestMapping("join.kosa")
public class JoinController {
	@Autowired
	private MemberDAO memberDAO;

	// 하나의 액션 "join.kosa"로 2개의 함수로 전송 방식 분리
//	@RequestMapping(value ="join.kosa", method = RequestMethod.GET)
	@RequestMapping(method = RequestMethod.GET)
//	@GetMapping
	public String form(Model model) {
		return "joinForm"; // /WEB-INF/views/joinForm.jsp
	}

//	@RequestMapping(value ="join.kosa", method = RequestMethod.POST)
	@RequestMapping(method = RequestMethod.POST)
//	@PostMapping
//	public String submit(Model model, HttpServletRequest request) {
	public String submit(@RequestParam(value = "id", required = true) String id,
			@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "pwd", required = true) String pwd,
			@RequestParam(value = "email", required = true) String email,
			@RequestParam(value = "age", required = true) int age) throws Exception {
		
		String viewPage = null;
		boolean joinMember = memberDAO.memberInsert(id, name, pwd, email, age);
		
		if(joinMember) viewPage= "redirect:login.kosa";
		else viewPage="joinForm";
		return viewPage;
	}
}
