<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 페이지</title>
</head>
<body>
	<h1>
		[ 회원 가입 페이지 ]
	</h1>

	<form action="/member/join" method="post">
		ID : <input type="text" name="member_id"><br>
		PW : <input type="password" name="member_pw"><br>
		Name : <input type="text" name="member_nm"><br>
		Birth : <input type="text" name="member_birth" placeholder="ex)19950531"><br>
		<input type="submit" value="전송">
	
	</form>
</body>
</html>