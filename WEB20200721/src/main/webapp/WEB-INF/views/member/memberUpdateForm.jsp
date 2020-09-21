<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정 페이지</title>
</head>
<body>
	<h1>[ 회원 정보 수정 ]</h1>
	
	<form action="/member/update" method="post">
		ID : <input type="text" name="member_id" value="${member.member_id }" readonly="readonly"><br>
		PW : <input type="password" name="member_pw"><br>
		Name : <input type="text" name="member_nm" value="${member.member_nm }"><br>
		<input type="submit" value="수정 완료">	
	</form>
</body>
</html>