package edu.kosa.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.kosa.model.DeptDAO;

@Controller
@RequestMapping("/delete.do")
public class DeleteController {
	
	@Autowired
	private DeptDAO deptDAO;
	
	@GetMapping
	public String deletePage(Model model) {
		return "delete";
	}
	
	@PostMapping
	public String delete(Model model, HttpServletRequest request) {
		int no = Integer.parseInt(request.getParameter("deptno"));
		deptDAO.deleteDept(no);
		System.out.println("ªË¡¶");
		return "redirect:list.do";
	}
}
