package kr.edu.kosa;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		// 저장
		model.addAttribute("serverTime", formattedDate );	// request.setAttribute("변수", 값 도는 변수)
		model.addAttribute("name", "zoo");
		model.addAttribute("age", 28);
		
		
		
		return "home";	// 이동할 view 페이지   /WEB-INF/views/ + home + .jsp
		// return type이 없어 return이 안쓰일 경우 메서드 명에 맞는 view 페이지를 찾아간다.
//		return "main";
	}
	
}
