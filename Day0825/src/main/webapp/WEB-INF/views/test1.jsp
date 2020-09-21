<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	function sendFile(){
		//제이쿼리에서 form을 전송할 때 사용하라고 제공하는 객체 FormData
		var formData = new FormData();
		//var file = $("input:file") -> 태그만 선택한 것. 아직 파일을 선택한 것이 아님
		var file = $("input:file")[0].files[0];
		//console.log(file);
		//"mfile"의 이름과 Controller의 파라미터 이름이 일치해야 한다.
		formData.append("mfile", file);
		// 데이터 전송 준비 끝

		$.ajax({
			url: "/sendFile",
			type: "post",
			data: formData,
			contentType: false,
			processData: false,
			success: function(){
				alert("통신성공!");
			},
			error: function(e){
				alert("통신 실패...");
				console.log(e);
			}
		});
	}

	function sendFileList(){
		//파일만 담음
		var formData = new FormData();
		var fileList = $("#multi")[0].files;
		for (var i = 0 ; i < fileList.length; i++){
			console.log(fileList[i]);
			formData.append("fileList", fileList[i]);
		}

		//form 내용물 다 담겠다?
		//var formData = new FormData($("form")[0]);

		$.ajax({
			url: "/sendFileList",
			type: "post",
			data: formData,
			contentType: false,
			processData: false,
			success: function(){
				alert("통신성공!");
			},
			error: function(e){
				alert("통신 실패...");
				console.log(e);
			}
		});
	}
</script>
</head>
<body>
	<form>
		<input type="file" mul>
	</form>
	<button onclick="sendFile();">컨트롤러로 파일 보내기</button>
	<br>
	<br>
	<form>
		<input type="file" multiple="multiple" id="multi">
	</form>
	<button onclick="sendFileList();">컨트롤러로 다중 파일 보내기</button>
</body>
</html>