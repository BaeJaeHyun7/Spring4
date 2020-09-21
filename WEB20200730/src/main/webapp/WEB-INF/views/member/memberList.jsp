<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록 페이지</title>
</head>
<body>

	<h1>
		[ 회원 목록 페이지 ]
	</h1>
	
	<h2>검색</h2>
	
	<form action="/member/search" method="post">
	최소 생년월일 :
	<input type="text" name="start_date" placeholder="ex) YYYYMMDD">
	최대 생년월일 :
	<input type="text" name="end_date" placeholder="ex) YYYYMMDD">
	<br>
	<input type="submit" value="검색">
	</form>
	
	<c:if test="${memberList.size() ==0 }">
		<h1>등록된 회원이 없습니다.</h1>
	</c:if>
	
	<c:if test="${memberList.size() !=0}">
		<table border="1">
		<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>이름</th>
			<th>생년월일</th>
			<th>가입일</th>
			<th>삭제</th>
		</tr>
		
		
		<c:forEach items="${memberList }" var="member" varStatus="status">
			<tr>
				<td>${status.count }</td>
				<td>${member.member_id }</td>
				<td>
					<a href="/member/selectOne?member_id=${member.member_id}"> ${member.member_nm } </a> 
				</td>
				<td>${member.member_birth }</td>
				<td>${member.member_indate }</td>
				<td><a href="/member/memberDelete?member_id=${member.member_id}">삭제</a></td>
			</tr>
		</c:forEach>
		
	
	</table>
	</c:if>
	
	
	
	
	
	<a href="/">메인으로 돌아가기</a>

</body>
</html>