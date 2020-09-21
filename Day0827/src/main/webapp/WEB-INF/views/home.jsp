<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
<h1>
	[ 메인 화면 ]
</h1>

<c:choose>
	<c:when test="${not empty sessionScope.loginId }">
	${sessionScope.loginId }님 환영합니다.
<ul>
	<li>
		<a href="/member/listForm">회원 목록 폼 이동</a>
	</li>
</ul>
<ul>
	<li>
		<a href="/member/logout">로그아웃</a>
	</li>
</ul>
<ul>
	<li>
		<a href="/board/boardList">글 목록 페이지</a>
	</li>
</ul>		
	
	</c:when>
	<c:otherwise>
<ul>
	<li>
		<a href="/member/joinForm">회원 가입 폼 이동</a>
	</li>
</ul>
<ul>
	<li>
		<a href="/member/loginForm">로그인 폼 이동</a>
	</li>
</ul>	
</c:otherwise>
</c:choose>
</body>
</html>
