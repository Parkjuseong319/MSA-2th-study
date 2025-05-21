package conn.kosa.date;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletDate extends HttpServlet {

	protected void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hello servlet");

		response.setCharacterEncoding("euc-kr"); // 이것도 깨지면 euc-kr.
		Calendar c = Calendar.getInstance(); // 시스템의 시간호출
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);

		PrintWriter pw = response.getWriter(); // getWriter 추상메서드.
		pw.write("<html><head><title>서버측 시간</title></head>");
		pw.write("<body><h1>Hello Servlet</h1>");
		pw.write("<h2>현재 시간은 ");
		pw.write(Integer.toString(hour) + " : " + Integer.toString(minute) + " : " + Integer.toString(second));

		pw.write("</h2></body></html>");
		pw.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
