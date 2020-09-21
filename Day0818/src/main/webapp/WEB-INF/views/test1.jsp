<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	var arr = ["https://naver.com", "https://daum.net", "https://google.co.kr"]
	$(function(){
		$("a").each(function(index, item){
			$(item).attr("href", arr[index])
			
			});
	});

	function removeLink(){
		/* 
			반복문을 이용해서 네이버만 지우기
			$("a").each(function(index, item){
			if($(item).attr("href") == "https://naver.com")
				$(item).removeAttr("href");
			
				
		}); */
		//id 선택자로 잡고 href를 삭제
		//$("#daum").removeAttr("href");
		//태그 선택자로 잡고 href를 삭제
		//$("a").removeAttr("href");	

		var txt = $("input[type=text]").val();

		$("a").each(function(index, item){
			if($(item).attr("href")==txt)
				$(item).removeAttr("href");
			});
	}

</script>
</head>
<body>
	<a>네이버</a>
	<a id="daum">다음</a>
	<a>구글</a>
	<br>
	<input type="text">
	<button onclick="removeLink()">링크 삭제</button>
</body>
</html>