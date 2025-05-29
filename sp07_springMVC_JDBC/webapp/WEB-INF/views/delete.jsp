<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>영업점 삭제 페이지</h2>
<form action="delete.do" method="post">
	지점번호: <input type="text" name="deptno" placeholder="지점번호 숫자로 넣으세요"><p>
	
	<input type="submit" value="삭제">&nbsp;&nbsp;
	<input type="reset" value="취소">&nbsp;&nbsp;
	<input type="button" value="목록보기" onclick="location.href='list.do'">&nbsp;&nbsp;
	<input type="button" value="지점저장" onclick="javascript:location.replace('write.do')">
</form>
</body>
</html>