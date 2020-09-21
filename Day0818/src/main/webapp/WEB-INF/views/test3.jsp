<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		//자바 스크립트 기본 문법
		/* document.getElementById("div1").onclick = function(){
				alert("World!"); 
			}); */
		$("#div1").on("click", function(){
			alert("World!");	
		});	

		$("#div1").on("mouseenter", function(){
			//$(this)는 이벤트의 주체. 여기선 $('div')
			$(this).html("World!");
			$(this).css("color", "white");
			$(this).css("backgroundColor", "black");
			// 이런 식으로 한꺼번에 처리할 수도 있다.
			/* $(this).css({
				color : "white",
				background-color : "black"
				}); */
		});

		$("#div1").on("mouseleave", function(){
			$(this).html("Hello,");
			$(this).css({
				color: "black",
				backgroundColor: "white"	
			});
		});

		$("input[type=text]").on("keydown", function(e){
			//console.log(e);
			// 로그인 진행, 키코드 13은 엔터
			/* if(e.keyCode == 13){
				} */
			});

		$("input[type=text]").on("keyup", function(e){
			var txt = $(this).val();
			$("#div2").html(txt);
		});

		$("input[type=radio]").on("change", function(){
			var val = $(this).val();
			$("#div2").html(val);
		});
	});
</script>
</head>
<body>
	<div id="div1">Hello,</div>
	
	<input type="text">
	<div id="div2"></div>
	
	<input type="radio" name="r" value="first">
	<input type="radio" name="r" value="second">
	<input type="radio" name="r" value="third">
</body>
</html>