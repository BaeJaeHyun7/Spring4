<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	function first(){
		$.ajax({
			url : "/first",
			success : function(){
				alert("통신 성공!");			
			}
		});
	}

	function second(){
		var data = {
			msg : "안녕"	
		}

		var settings = {
			url : "/second",
			//이름이 없으니까 콘솔에서 null로 뜸
			//data : "안녕하세요.",
			//자바스크립트 객체를 이용해서 이름을 붙임
			/* data : {
				msg : "안녕하세요?"
			}, */
			//미리 만들어 놓고 불러온거
			data : data,
			success : function(){
				alert("통신 성공!");
			}

		}

		$.ajax(settings);	
	}

	function third(){
		$.ajax({
			url : "/third",
			//컨트롤러에서 문자열을 받아올 때는 success의 function에 매개변수로 가지고 온다.
			success : function(data){
				alert("통신 성공!");
				alert("컨트롤러에서 받은 데이터 :" + data);
			}
		});
	}

	function fourth(){
		$.ajax({
			url : "/fourth",
			type : "post",
			data : {
				msg : "헬로우"
			},
			success : function(data){
				alert("통신 성공!");
				alert("컨트롤러에서 받은 데이터 :" + data);
			}
		});	

	}

	

	
	

</script>
</head>
<body>
	<button onclick="first()">AJAX로 단순 통신하기</button>
	<button onclick="second()">AJAX로 문자열 보내기</button>
	<button onclick="third()">컨트롤러에서 문자열 보내기</button>
	<button onclick="fourth()">컨트롤러로 문자열 보내고 받기</button>
	
</body>
</html>