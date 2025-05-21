<%@ page  language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c"  uri="http://java.sun.com/jstl/core_rt" %>
<%@taglib prefix="fmt"  uri="http://java.sun.com/jstl/fmt_rt" %>

<c:import url="date.jsp"  var="today" />

<%-- <% request.setCharacterEncoding("utf-8"); %> --%>
<fmt:requestEncoding value="UTF-8" />

<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title>ex03_jstl.jsp   JSTL core, fmt  libary </title>
</head>
<body>
${ today } <br><hr>

파라미터 : <c:out value="${ param['id'] }" /><br />
			<c:out value="${ param.id }" /><br /><p>
		<c:out value="${param.pwd }"/><br>
<form action="ex03_jstl.jsp"  method="post">
	<input type="text"  name="id"><br>
	<input type="password"  name="pwd">
	
	<input type="submit"  value="확인">
</form>

<%
	String id = request.getParameter("id");
	out.print("id = " + id + "<br >")	;
%>

파라미터 : <c:out value="${ param['id'] }" /><br />
			<c:out value="${ param.id }" /><br /><p>
</body>
</html>





