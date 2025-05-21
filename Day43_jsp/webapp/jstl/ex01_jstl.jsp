<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01_jstl</title>
</head>
<body>
<h3>JSTL core 라이브러리 사용 예제</h3>
<% String str = "Hello JSTL!"; %>
<c:set var="str" value="Hello JSTL" /><br>
<h3>&lt;c:set&gt; 사용 후: <c:out value="${str}"/></h3>
</body>
</html>