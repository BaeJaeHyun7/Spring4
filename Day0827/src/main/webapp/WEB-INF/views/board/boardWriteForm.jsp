<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[글쓰기 화면]</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">

	function formCheck(){
		 var title = document.getElementById("board_title").value;
	     var context = document.getElementById("board_context").value;

	     if(title == ''){
	         alert("글제목은 반드시 입력해주세요.");
	         return false;
	     }

	      if(context == ''){
	         alert("글내용은 반드시 입력해주세요.");
	         return false;

		}
			return true;
	}



</script>
</head>
<body>

	<h1>[ 글 작성 ]</h1>
	
	<form action="/board/boardWrite" method="post" onsubmit="return formCheck();">
		글제목 : <input type="text" name="board_title" id="board_title"><br>
		글내용 <br>
		<textarea rows="10" cols="40" name="board_context" id="board_context"></textarea><br>
		
		<input type="submit" value="글 등록">
	
	
	
	
	</form>

</body>
</html>