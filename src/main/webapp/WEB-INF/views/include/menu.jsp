<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<!-- 
위 코드를 자바로 할 경우
<% //String path=request.getContextPath();%>
 -->
<div style="text-align: center;">
	<a href="${path}/">main</a>
	<a href="${path}/gugu.do?dan=8">구구단</a>
	<a href="${path}/test.do">테스트</a>
	<a href="${path}/member/list.do">회원관리</a>
</div>
<hr>