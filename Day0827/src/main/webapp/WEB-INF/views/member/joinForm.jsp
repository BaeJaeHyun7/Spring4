<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 폼</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
      function idCheck(){
         if ($("#member_id").val() == "") {
            alert("id는 반드시 입력해주세요.");
         } else {
            $.ajax({
               url:"/member/idCheck"
               ,data:{
                  member_id: $("#member_id").val()
               }
               ,success:function(data){
                  $("div").text(data);
               }
               ,error: function(e){
                  alert("통신 실패...");
                  console.log(e);
               }
            });
         }
            
         
      }

      function formCheck(){
      var id = document.getElementById("member_id").value;
      var pw = document.getElementById("member_pw").value;
      var pwCheck = document.getElementById("pwCheck").value;
      var name = document.getElementById("member_nm").value;
      var birth = document.getElementById("member_birth").value;

      if(id == ''){
         alert("id는 반드시 입력해주세요.");
         return false;
      }else if(id.length<4 || id.length>12){
         alert("id는 4~12글자로 입력해 주세요.")
         return false;
      }
      if(pw ==''){
         alert("pw는 반드시 입력해주세요.");
         return false;
      }else if(pw.length<4 || pw.length>12){
         alert("pw는 4~12글자로 입력해 주세요.");
         return false;
      }
      if(pw != pwCheck){
         alert("비밀번호 체크 확인해주세요.");
         return false;
      }
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
   <h1>회원 가입 폼</h1>
   <form action="/member/join" method="post" onsubmit="return formCheck();">
      ID : <input type="text" name="member_id" id="member_id">
      <input type="button" value="ID 중복 검사" onclick="idCheck();">
      <div></div>
      PW : <input type="password" name="member_pw" id="member_pw"><br>
      PWCheck : <input type="password" id="pwCheck"><br>
      Name : <input type="text" name="member_nm" id="member_nm"><br>
      Birth : <input type="text" name="member_birth" id="member_birth"><br>
      <input type="submit" value="가입">
   </form>

</body>
</html>