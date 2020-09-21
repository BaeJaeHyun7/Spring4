<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
	<title>메인 화면</title>
</head>
<body>
<h1>
	[ 메인 화면 ]  
</h1>

<h2>
	${gisu }
</h2>

<!-- 
	요청주소를 작성할 때 반드시 지켜야하는 규칙
	1. 동일한 요청 주소를 작성하지 않는다. 요청주소는 고유해야 한다.

 -->

<ul>
	<li>
		<a href="/ex/example1?name=test">JSP 파일 이동1</a>
		<a href="/ex/example2">JSP 파일 이동2</a>
		<a href="/ex/example3">JSP 파일 이동3</a>
	</li>
</ul>
</body>
</html>
