<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AJAX 보충1</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	function sendArray(){
		$.ajax({
			url: "/sendArray",
			type: "post",
			data:{
				arr: [
					$("input:text").val(), 
					$("input:password").val()
				]
			},
			traditional: true,
			success: function(){
				alert("통신 성공!");
			},
			error: function(e){
				alert("통신 실패...");
				console.log(e);
			}
		});
	}

	function sendVO(){
		$.ajax({
			url: "/sendVO",
			type: "post",
			//폼 태그로부터 값 가져오기
			/* data:{
				userid: $("input:text").val(),
				userpw: $("input:password").val()
			}, */
			//serialize()로 다 가져오기, input태그에 name 속성 필수
			data: $("form").serialize(),
			success: function(){
				alert("통신 성공!");
			},
			error: function(e){
				alert("통신 실패...");
				console.log(e);
			}
		});	
	}

	// 데이터를 컨트롤러에 보낼 때는, 자바스크립트의 객체가 알아서 자바의 객체로 변환이 되나
	// 데이터를 컨트롤러에서 받을 때는, 자동변환이 일어나지 않는다.
	// jackson 디펜던시를 추가해줘야 한다. (서로 다른 자료형을 연결한다.)
	// jason 때도 필요하다.
	function receiveArray(){
		$.ajax({
			url: "/receiveArray",
			type: "post",
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

	function receiveVO(){
		$.ajax({
			url: "/receiveVO",
			type: "post",
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

</script>

</head>
<body>
	<form>
		ID : <input type="text" name="userid"><br>
		PW : <input type="password" name="userpw">
	</form>
	<button onclick="sendArray();">컨트롤러로 배열 보내기</button>
	<button onclick="sendVO();">컨트롤러로 VO 보내기</button>
	
	<button onclick="receiveArray();">컨트롤러에서 배열 받기</button>
	<button onclick="receiveVO();">컨트롤러에서 VO 받기</button>
</body>
</html>