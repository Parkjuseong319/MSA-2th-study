<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=utf-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<h2>Home.jsp</h2>
${name }<p>
${age }
<img alt="house" src="./resources/3.jpg">
<P>  The time on the server is ${serverTime}. </P>
<img alt="dog" src="./images/puppy.png">
<img alt="test" src="./test/1.jpg">
</body>
</html>
