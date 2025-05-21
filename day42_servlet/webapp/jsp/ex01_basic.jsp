<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01_basic.jsp</title>
</head>
<body>
<h2>JSP Basic</h2>
<div>아무거나~~</div>
<%
	// 스크립트릿: 함수를 제외한 자바코드만 사용가능 - 변수선언, 제어문,...
	String str = "안녕~ JSP를 이용한 웹 브라우저에 출력합니다.";
%>
<h3><%= str %></h3><hr>
<%
	String str2 = "안녕 22222 JSP를 이용한 웹 브라우저에 출력합니다.";
	out.print(str2);
	
	int su = 300;
	for(int i =1; i< 11; i++){
%>
	<h3><%= i %></h3>
<%
	}	// for end
%>		<hr>
<% 	for(int i =1; i< 11; i++){
		if(i%2 == 0){
			out.print(i + "<br>");
		}	// if end
	}	// for end
%>

<%! 
// 선언문: 자바 문법, 변수선언, 메서드,...
public String show(){
	return "안녕 jsp입니다";
}
 %>
 <%= show() %><br>
 <%= "string" %><br>
 <%= 123 %><br>
 <%= 12.231 %><br>
 <h2>200 + su = <%= su+200 %></h2>
</body>
</html>