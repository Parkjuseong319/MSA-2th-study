<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
		session.invalidate(); 		//세션 지워준다.
		response.sendRedirect("main.jsp");
%>
<!DOCTYPE html>
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>logout.jsp</title>
</head>
<body>

</body>
</html>