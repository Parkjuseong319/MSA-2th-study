package kr.edu.kosa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ListController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView();
		
		mav.addObject("list", "List page 입니다");
		mav.addObject("title", "title page 입니다");
		mav.addObject("content", "content  page 입니다");
		
//		mav.setViewName("/WEB-INF/views/list.jsp");
		mav.setViewName("list");
		return mav;
	}

}
