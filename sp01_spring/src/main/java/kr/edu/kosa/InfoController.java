package kr.edu.kosa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InfoController {

	@RequestMapping("/info")
	public String info(Model model) {
		
		String phone = "010-1234-4567";
		
		model.addAttribute("phone", phone);
		model.addAttribute("hobby", "±‚≈∏");
		
		
		return "info";	// return "/WEB-INF/views/info.jsp"
	}
}
