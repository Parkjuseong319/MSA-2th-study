<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Driver"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01_jdbc.jsp JDBC test</title>
</head>
<body>
<%
	Connection conn = null;
	try{
		// 1. 2. 드라이버 로드 및 오픈
		Class.forName("oracle.jdbc.OracleDriver");
		out.print("driver load success<br>");
		// 드라이버:@ip주소:포트번호:SID
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "zoo", "oracle");
		out.print("connection success<br>");
		
	} catch(Exception e){
		e.printStackTrace();
	}finally{
		// conn.close();
	}
%>
</body>
</html>