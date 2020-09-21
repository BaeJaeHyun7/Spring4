<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 내용 페이지</title>
<script type="text/javascript">
	function boardDelete(){
		var board_no = document.getElementById("board_no").value;
		location.href = "/board/boardDelete?board_no="+board_no;
		}

	function boardUpdateForm(){
		var board_no = document.getElementById("board_no").value;
		location.href = "/board/boardUpdateForm?board_no="+board_no;
		}


</script>
</head>
<body>
	<h1>[ 글 내용 페이지 ]</h1>
	
	글번호 : ${map.BOARD_NO }<br>
	제목 : ${map.BOARD_TITLE }<br>
	내용 : ${map.BOARD_CONTEXT }<br>
	작성일 : ${map.BOARD_INDATE }<br>
	조회수 : ${map.BOARD_HITS }<br>
	작성자 : ${map.MEMBER_NM }<br>
	첨부파일 : <a href="/board/download?board_no=${map.BOARD_NO }">${map.ORIGINALFILE }</a>
	<br>

		<c:if test="${sessionScope.loginId == map.MEMBER_ID }">
		<br>
		<input type="hidden" id="board_no" value="${map.BOARD_NO}">
		<input type="button" value="수정 폼 이동" onclick="boardUpdateForm()">
		<input type="button" value="삭제" onclick="boardDelete()"><br>
		</c:if>
	
	

	
	
		
	
</body>
</html>