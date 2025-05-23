<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4>컨트롤러에서 가져온 값 출력</h4>
<h1>${ result }</h1>

<c:set value='${ str}' var="str"/>
<h2><font color="blue" size="5">
	<c:out value="${str }"></c:out>
</font></h2>

</body>
</html>