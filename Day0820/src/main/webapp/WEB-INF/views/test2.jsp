<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	function fifth(){
		$.ajax({
			url : "/fifth",
			type : "post",
			success : function(data){
				alert("통신 성공!");
				console.log(data);
			},
			error : function(e){
				alert("통신 실패...");
				console.log(e);
			},
			//통신의 성공여부에 관계없이 항상 실행된다.
			complete : function(){
				alert("통신 종료.");

			}



		});
	}

	function sixth(){
		$.ajax("/sixth")
			.done(function(data){
				alert("통신 성공!");
				console.log(data);

			})

			.fail(function(e){
				alert("통신 실패...");
				console.log(e);

			})
			.always(function(){
				alert("통신 종료.");

			})


	}



</script>
</head>
<body>
	<button onclick="fifth()">통신 결과 처리 방법1</button>
	<button onclick="sixth()">통신 결과 처리 방법2</button>
</body>
</html>