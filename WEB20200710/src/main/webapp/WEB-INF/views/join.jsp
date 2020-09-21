<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 폼</title>

<script type="text/javascript">
	function formCheck(){
		var user_id = document.getElementById('user_id').value;
		var user_pw = document.getElementById('user_pw').value;
		var ph1 = document.getElementById('ph1').value;
		var ph2 = document.getElementById('ph2').value;
		var ph3 = document.getElementById('ph3').value;
		var phone_check = ph1+ph2+ph3;

		var phone = ph1 +"-"+ ph2 +"-"+ ph3;
		
		document.getElementById('phone').value = phone;
		
		if (user_id =='') {
			alert("아이디를 반드시 입력해 주세요.");
			return false;
		} else if (user_id.length < 4 || user_id.length > 12) {
			alert("아이디는 4~12글자로 입력해 주세요.");
			return false;
		}

		if (user_pw =='') {
			alert("패스워드를 반드시 입력해 주세요.");
			return false;
		} else if (user_pw.length < 4 || user_pw.length > 12) {
			alert("패스워드는 4~12글자로 입력해 주세요.");
			return false;
		}

		if(ph1 == '' || ph2 == '' || ph3 == '' ){
			alert("폰번 적어라");

			return false;
			}

		for(var i = 0 ; i <phone_check.length;i++){
			var ch = phone_check.charAt(i);
			if(isNaN(ch)){
				alert("숫자만 입력해.");
				return false;
			}
		}
		return true;
	}

</script>
</head>
<body>
			<h1>[ 회원가입 폼 ]</h1>
	
	<form action="/join" onsubmit="return formCheck();" method="post">
		ID : <input type="text" name="id" id="user_id"><br>
		PW : <input type="password" name="pw" id="user_pw"><br>
		Phone : <input type="text" id="ph1">
				<span>-</span>
				<input type="text" id="ph2">
				<span>-</span>
				<input type="text" id="ph3">
				<input type="hidden" id="phone" name="phone">
		<br>
		<br>
		<input type="submit" value="가입">
	
	</form>

</body>
</html>