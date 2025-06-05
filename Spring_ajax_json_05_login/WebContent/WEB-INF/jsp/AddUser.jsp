<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Users using ajax</title>

<!-- 제공되고 있는 jQuery 라이브러리 사용시 CDN 사용 가능 -->
<script src="<%=request.getContextPath() %>/js/jquery.js"></script>

<script type="text/javascript">
	var contexPath = "<%=request.getContextPath() %>";
</script>

<!-- 사용자가 필요에 의해서 자바스크립트 따로 구현해서 넣을 수 있다 -->
<script src="<%=request.getContextPath() %>/js/user.js"></script>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/style/app.css">
</head>

<body>
<h1>Add Users using Ajax ........</h1>
	<table>
		<tr><td colspan="2"><div id="error" class="error"></div></td></tr>
		<tr><td>Enter your name : </td><td> <input type="text" id="name"><br/></td></tr>
		<tr><td>Education : </td><td> <input type="text" id="education"><br/></td></tr>
		<tr><td colspan="2"><input type="button" value="Add Users" onclick="doAjaxPost()"><br/></td></tr>
		<tr><td colspan="2"><div id="info" class="success"></div></td></tr>
	</table>
</body>
</html>