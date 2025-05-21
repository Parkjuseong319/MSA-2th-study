package edu.kosa;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//DB 대체
	public String user = "kingsmile";
	public String pass = "1004";
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("login call~~~");
		
		String id = request.getParameter("id");
		String passwd = request.getParameter("pwd");
		
//		System.out.println(id + ", " + passwd);
		response.setCharacterEncoding("euc-kr");
		PrintWriter pw = response.getWriter();
		pw.write("<html><head><title>Login Result Window</title></head><body><b><br>");
		
		if(user.equals(id) && !passwd.equals(pass)) {
			pw.write("암호가 틀렸습니다. <br>");
			pw.write("<a href='html/loginForm.html'>Login</a>");
		} else if(user.equals(id) && passwd.equals(pass)) {
			pw.println("반갑습니다. 어서와");
			pw.println("너 아이디는 " + id + " 비밀번호는 " + pass);
			pw.println("<a href='html/loginForm.html'>Logrin</a>");
		}else {
			pw.println("등록되지 않은 사용자입니다.<br>");
//			pw.println("<a href='html/loginForm.html'>Login</a>");
			pw.println("<a href='javascript:history.go(-1)'>Login</a>");
			
		}
		
		pw.println("</b></body></html>");
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
