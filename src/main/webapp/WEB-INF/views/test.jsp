<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>Insert title here</title>
<!-- json의 형식 
{변수명: 값, 변수명: 값}
{name: "냉장고", price:500000}
-->
<%@ include file="include/header.jsp" %>
<script>
function doF(){
	$.ajax({
		type: "post",
		url: "${path}/test/doF",
		success: function(result){
			console.log(result);
			$("#result").html("상품명: " + result.name + ", 가격: " + result.price);
		}
	});
}
</script>
</head>
<body>
	<%@ include file="include/menu.jsp" %>
	<H2>링크 테스트</H2>
	<a href="${path}/test/doA">doA</a>
	<a href="${path}/test/doB">doB</a>
	<a href="${path}/test/doC">doC</a>
	<a href="${path}/test/doD">doD</a>
	<a href="javascript:doF()">doF</a>
	<div id="result"></div>
</body>
</html>