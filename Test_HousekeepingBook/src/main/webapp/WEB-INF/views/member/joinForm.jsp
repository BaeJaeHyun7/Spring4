<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<script type="text/javascript">
	function formCheck(){
			var acc_id = document.getElementById("acc_id").value;
			var acc_pw = document.getElementById("acc_pw").value;
			var acc_pw_check = document.getElementById("acc_pw_check").value;
			var acc_nm = document.getElementById("acc_nm").value;

			if(acc_id == '' || acc_id.length ==0){
				alert("아이디를 입력해 주세요.");
				return false;

				}else if(acc_id.length<3 || acc_id.length>8){
					alert("아이디는 3~8글자로 입력해 주세요.");
					return false;
					}

			if(acc_pw == '' || acc_pw.length ==0){
				alert("비밀번호를 입력해 주세요.");
				return false;

				}else if(acc_pw.length<5 || acc_pw.length>10){
					alert("비밀번호는 5~10글자로 입력해 주세요.");
					return false;
					}

			if(acc_pw != acc_pw_check){
				alert("동일한 비밀번호를 입력해 주세요.");
				return false;
				}

			if(acc_nm == '' || acc_nm.length ==0){
				alert("이름을 입력해 주세요.");
				return false;
				}

			return true;
	}


</script>
</head>

<body>
	<h1>[ 회원 가입 폼 ]</h1>
	
	<form action="/member/join" method="post" onsubmit="return formCheck();">
		아이디 : <input type="text" name="acc_id" id="acc_id"><br>
		비밀번호 : <input type="password" name="acc_pw" id="acc_pw"><br>
		비밀번호 확인 : <input type="password" id="acc_pw_check"><br>
		이름 : <input type="text" name="acc_nm" id="acc_nm"><br>
		<input type="submit" value="회원 가입">
	</form>
</body>
</html>