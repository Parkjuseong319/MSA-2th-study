<%@page import="edu.kosa.ex04.Emp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	public String message(){
	return "msa 2th fighting";
}
%>
<%
	Emp e = new Emp();		// 객체생성
	out.print(e.toString() + "<p><hr>");

	e.setEmpno(123);
	e.setName("강감찬");
	e.setPay(800000);
	
	out.print(e);
	
	out.print(e.getName());
	int num = 8888;
%>
</body>
</html>