<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>배열관리</title>
<style type="text/css">
	.cls{
		background-color : orange;
	}
</style>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">

	var arr = ["red","blue","green"];

	$(function(){
		//자바스크립트 기본 문법을 이용한 반복문
		for(var i = 0 ; i < arr.length ; i++){
				console.log(i + "," + arr[i]);
			}
		//jQuery 문법을 이용한 반복문1
		$.each(arr, function(index, item){
			console.log(index + "," + item);

			});	

		//jQuery 문법을 이용한 반복문2
		$("div").each(function(index, item){
			$(item).css("color", arr[index]);
			//$(item).addClass("cls");
			//$(item).removeClass("cls2");
			
			var attr = $(item).attr("class");
			console.log(attr);

			$(item).attr("class","cls3");
			$(item).attr("data-type","test" + index);
			});
		});
		

</script>
</head>
<body>
	<div class="cls cls2">첫 번째 줄</div>
	<div class="cls cls2">두 번째 줄</div>
	<div class="cls cls2">세 번째 줄</div>
</body>
</html>