<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Hello page</h2>
<h4>${greeting }</h4>
<button onclick="javascript:window.location.href='list.do'">목록보기</button>&nbsp;&nbsp;
<input type="button" value="지점저장" onclick="javascript:location.replace('write.do')">&nbsp;&nbsp;
<input type="button" value="지점삭제" onclick="javascript:location.href='delete.do'">
</body>
</html>