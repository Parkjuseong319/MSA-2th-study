<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <jsp:forward page="/fileUI"></jsp:forward> --%>
<%
	String url = request.getContextPath()+"/fileUI";
	response.sendRedirect(url);
%>
