<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AJAX 보충2</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	function sendJSON(){
		$.ajax({
			url: "/sendJSON",
			type: "post",
			data: JSON.stringify({
				userid: $("input:text").val(),
				userpw: $("input:password").val()
			}),
			contentType: "application/json;charset=utf-8;",
			success: function(){
				alert("통신 성공!");
			},
			error: function(e){
				alert("통신 실패...");
				console.log(e);
			}
		});

	}

	function receiveJSON(){
		$.ajax({
			url: "/receiveJSON",
			type: "post",
			dataType: "json",
			success: function(data){
				alert("통신 성공!");
				console.log(data);
			},
			error: function(e){
				alert("통신 실패...");
				console.log(e);
			}
		});

	}

	function sendList(){
		var list = [$("input:text").val(), $("input:password").val()];

		$.ajax({
			url: "/sendList",
			type: "post",
			data: JSON.stringify(list),
			contentType: "application/json;charset=utf-8;",
			success: function(){
				alert("통신 성공!");
			},
			error: function(e){
				alert("통신 실패...");
				console.log(e);
			}
		});
	
	}

	//stringify -> 객체를 문자열화
	function sendMap(){
		var map = {
				userid: $("input:text").val(), 
				userpw: $("input:password").val()
		};

		$.ajax({
			url: "/sendMap",
			type: "post",
			data: JSON.stringify(map),
			contentType: "application/json;charset=utf-8;",
			success: function(){
				alert("통신 성공!");
			},
			error: function(e){
				alert("통신 실패...");
				console.log(e);
			}
		});
	
	}

	//parse -> 문자열을 객체화 (stringify와 반대로 동작)
	function receiveList(){
		$.ajax({
			url: "/receiveList",
			type: "post",
			//dataType: "json",
			dataType: "text",
			/* success: function(data){
				alert("통신 성공!");
				console.log(data);
			}, */
			success: function(data){
				console.log(data);
				console.log(JSON.parse(data));
			},
			error: function(e){
				alert("통신 실패...");
				console.log(e);
			}
		});

	}

	function receiveMap(){
		$.ajax({
			url: "/receiveMap",
			type: "post",
			//dataType: "json",
			dataType: "text",
			/* success: function(data){
				alert("통신 성공!");
				console.log(data);
			}, */
			success: function(data){
				console.log(data);
				console.log(JSON.parse(data));
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
		<input type="text"><br>
		<input type="password">
	</form>
	
	<button onclick="sendJSON();">컨트롤러에서 JSON 객체 보내기</button>
	<button onclick="receiveJSON();">컨트롤러에서 JSON 객체 받기</button>
	<br>
	<button onclick="sendList();">컨트롤러에 ArrayList 객체 보내기(feat.JSON)</button>
	<button onclick="sendMap();">컨트롤러에 HashMap 객체 보내기 (feat.JSON)</button>
	<br>
	<button onclick="receiveList();">컨트롤러에 ArrayList 객체 받기(feat.JSON)</button>
	<button onclick="receiveMap();">컨트롤러에 HashMap 객체 받기(feat.JSON)</button>
	<br>
</body>
</html>