package conn.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import conn.kosa.controller.CommandProcess;

@WebServlet("/list")
public class ListController extends HttpServlet implements CommandProcess {
	private static final long serialVersionUID = 1L;

	@Override
	public String doProcess(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		request.setAttribute("list", "List page 입니다");
		request.setAttribute("title", "Title!");
		request.setAttribute("contents", "contents 입니다");
		return "/board/list.jsp";
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher d = request.getRequestDispatcher(doProcess(request,response));
		d.forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
