<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
<style type="text/css">
	span {color : red}


</style>

<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn1").on("click", function() {
			console.log("a");
		});
		$("#btn1").click(function() {
			console.log("b");
			//이벤트 제거 함수 off()
			$(this).off();
		});

		$("#btn1").mouseenter(function(){
			$(this).css({
				color : "white",
				backgroundColor : "black"
			});

		});	

		$("#like").click(function(){
			//숫자형으로 형변환
			var cnt = Number($("#cnt").text());	
			cnt += 1;
			$("#cnt").text(cnt);
		});	

		//span을 클릭할 때, id가 like는 태그의 click함수를 실행시켜주세요.
		$("span").click(function(){
			//다른대상에 있는 특정 이벤트를 실행시키는 함수 trigger
			$("#like").trigger("click");
		});
	});


</script>
</head>
<body>
	<button id="btn1">Click!</button><br>
	<br>
	<span>♥</span>
	<span id="cnt">0</span>
	<button id="like">좋아요!</button>
</body>
</html>