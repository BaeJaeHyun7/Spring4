<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 개인정보 페이지</title>
</head>
<body>

	<h1>[회원 개인정보 페이지]</h1>
	ID : ${member.member_id }<br>
	PW : ${member.member_pw }<br>
	Name : ${member.member_nm }<br>
	Birth : ${member.member_birth }<br>
	등록일 : ${member.member_indate }<br>
</body>
</html>