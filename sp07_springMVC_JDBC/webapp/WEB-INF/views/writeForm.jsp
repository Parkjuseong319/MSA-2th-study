<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>writeForm page</h1>
<h3>회사 지점 위치 추가 글쓰기</h3>
<form action="write.do" method="post">
	지점번호: <input type="text" name="deptno" placeholder="지점번호 숫자로 넣으세요"><br>
	영업소명: <input type="text" name="dname" placeholder="지점 지역 기재"><br>
	위   치: <input type="text" name="loc"><p>
	
	<input type="submit" value="저장">&nbsp;&nbsp;
	<input type="reset" value="취소">&nbsp;&nbsp;
	<input type="button" value="List Page" onclick="location.href='list.do'">&nbsp;&nbsp;
	<input type="button" value="지점삭제" onclick="javascript:location.href='delete.do'">
</form>
</body>
</html>