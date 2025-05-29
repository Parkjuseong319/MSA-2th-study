package edu.kosa.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.kosa.model.DeptDAO;
import edu.kosa.model.DeptDTO;

@Controller
@RequestMapping("/write.do")
public class WriteController {
	
	@Autowired
	private DeptDAO deptDAO;
	
//	@RequestMapping(method=RequestMethod.GET)
	@GetMapping
	public String writeForm(Model model) {
		return "writeForm";
	}
	
//	@RequestMapping(method=RequestMethod.POST)
	@PostMapping
	public String write(Model model, HttpServletRequest request) {
		
		//request.setCharacterEncoding("utf-8");
		int no = Integer.parseInt(request.getParameter("deptno"));
		String name = request.getParameter("dname");
		String loc = request.getParameter("loc");
		
		DeptDTO dto = new DeptDTO();
		dto.setDeptno(no);
		dto.setDname(name);
		dto.setLoc(loc);
		deptDAO.insertDept(dto);
		model.addAttribute("dept", dto);
		
		return "redirect:list.do";
	}
}
