<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- uri 부분은 ctrl+space를 누르면 쉽게 넣을 수 있다 -->
<!-- 핵심태그  -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--  아래 태그는 날짜나 숫자를 지원해주는 태그 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!-- 위와 같은 jstl을 사용할 수 있는 이유는 pom.xml에  dependency에 정의해되 있다. jstl로 검색하기 -->


<c:set var="path" value="${pageContext.request.contextPath}" />
<script src="http://code.jquery.com/jquery-3.3.1.min.js"></script>