<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
</head>
<body>
	<h2>list page</h2>
	
	<c:forEach items="${list }" var="list">
		${list.deptno }	&nbsp;&nbsp;
		${list.dname }&nbsp;&nbsp;
		${list.loc } <hr>
	</c:forEach>
	
<input type="button" value="지점저장" onclick="javascript:location.replace('write.do')">&nbsp;&nbsp;
<input type="button" value="Hello Page" onclick="javascript:location.href='hello.do'">&nbsp;&nbsp;
<input type="button" value="지점삭제" onclick="javascript:location.href='delete.do'">
</body>
</html>