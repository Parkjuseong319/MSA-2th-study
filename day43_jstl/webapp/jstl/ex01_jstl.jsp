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
<%-- <c:set var="str" value="Hello JSTL" /> --%>
<c:set value="Hello JSTL" var="str"/>
<c:set value="1000" var="su"/>
<c:set value="12.34" var="num"/>
<h3>&lt;c:set&gt; 사용 후: <c:out value="${str}"/></h3>
<h3>&lt;c:set&gt; 사용 후: <c:out value="${su}"/></h3>
<h3>&lt;c:set&gt; 사용 후: <c:out value="${num}"/></h3>
<c:set value="happyZoo" var="name"/>
<h3>이름은 <c:out value="${name}"/></h3>
<c:set var="num2">300</c:set>
<h3>&lt;c:set&gt; 사용 후: <c:out value="${num2}"/></h3><hr>
<c:catch var="error">
	<%= 10/0 %>
</c:catch>
<h3>&lt;c:catch&gt;로 잡은 오류: <c:out value="${error}"/></h3><hr>

<%
	String msg = "hello jstl~";
	out.print(msg + "<br>");
%>
표현식을 이용한 출력: <%= msg %><p>
JSTL을 이용하면
<c:set var="msg2">hello jstl!</c:set>
message = <c:out value="${msg2 }" /><hr>

<%
	String name2 = "Zoo";
	pageContext.setAttribute("id", "guitarman");
	session.setAttribute("pwd", "1234");
	application.setAttribute("team", "우리팀");
	request.setAttribute("age", 28);
%><br>

name2 = ${name2}<br/>
name2 = <c:out value="${name2 }" default="no name"/><br>
id = ${id }<br>
pwd = ${pwd }<br>
team = ${team }<br>
age = ${age }<br><hr>

<c:if test="${ 5 < 10 }">	<!-- else문이 없다. -->
	<h3>5는 10보다 작다</h3>
</c:if>
<c:if test="${ 5 >= 10 }">	
	<h3>5는 10보다 크지 않다</h3>
</c:if><hr>
<c:if test="${ 6+3 == 9 }"><h3>6 + 3 = 9</h3></c:if>
<c:if test="${ 6+3 != 9 }"><h3>6 + 3 != 9</h3></c:if>

<!-- java : switch ~case -->
<c:choose>
	<c:when test="${ 5 + 10 == 50 }"><h3>5 + 10 == 50</h3></c:when>
	<c:when test="${ 50 + 10 == 50 }"><h3>50 + 10 == 50</h3></c:when>
	<c:when test="${ 10 + 10 != 50 }"><h3>10 + 10 != 50</h3></c:when>
	<c:otherwise><h3>no answer</h3></c:otherwise>		
</c:choose><!-- otherwise는 switch case 구문에서 default에 해당 -->
</body>
</html>