<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">

function formCheck(){
   
    var name = document.getElementById("member_nm").value;
    var birth = document.getElementById("member_birth").value;

   
    if(name ==''){
       alert("name는 반드시 입력해주세요.");
       return false;
    }

    if(birth ==''){
        alert("생년월일은 반드시 입력해주세요.");
        return false;
     }
    return true;

 }

</script>
</head>
<body>

	<h1>[ 회원 정보 수정 ]</h1>
	<form action="/member/update" method="post" onsubmit="return formCheck();">
		<table>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="member_id" value="${member.member_id }" readonly="readonly"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="member_pw"></td>
			</tr>
			<tr>
				<th>비밀번호 확인</th>
				<td><input type="password" name="member_pw_check"></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="member_nm" value="${member.member_nm }" id="member_nm"></td>
			</tr>
			<tr>
				<th>생년월일</th>
				<td><input type="text" name="member_birth" placeholder="ex:19900316" id="member_birth"></td>
			</tr>		
		</table>
		
		<input type="submit" value="수정완료">
</form>

</body>
</html>