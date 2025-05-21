package edu.kosa;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/info")
public class information extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String number = request.getParameter("phone");
		String addr = request.getParameter("addr");

		response.setCharacterEncoding("euc-kr");
		PrintWriter pw = response.getWriter();
		pw.write("<html><head><title>Input Result Window</title></head><body><b><br>");

		pw.write("당신의 이름은 " + name + "<br> 연락처는 " + number + "<br>주소는 " + addr);
		pw.write("<br><a href='html/infoForm.html'>재입력하기</a>");
		pw.println("</b></body></html>");
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
