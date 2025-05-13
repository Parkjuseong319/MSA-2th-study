<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	결과 출력됩니다.<p>
	<% 
	
	String name = request.getParameter("name");
	String pass = request.getParameter("password");
	String email = request.getParameter("mail");
	
	out.print(name + "님 반갑습니다. 비번은 " + pass + "<br>이메일 주소는 " + email);
	
	%>
	<hr>
	<h2><%= name + "님 반갑습니다. 비번은 " + pass + "<br>이메일 주소는 " + email %></h2>
	
<%--
	<%! %>
	<%= %>		<-- 출력해주는 태그
--%>
</body>
</html>