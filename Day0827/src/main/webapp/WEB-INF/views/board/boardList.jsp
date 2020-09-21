<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

	function boardWriteForm(){

		location.href = "/board/boardWriteForm";
		}

	function searchBoard(){

		var searchType = document.getElementById("searchType").value;
		var searchText = document.getElementById("searchText").value;

		location.href = "/board/searchBoard?searchType="+ searchType + "&searchText=" + searchText;

		}




</script>
</head>
<body>
	<h1>[ 글 목록 ]</h1>
	<table border="1">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<c:forEach items="${list }" var="data" varStatus="status">
		<tr>
			<td>${status.count }</td>
			<td>
				<a href="/board/boardRead?board_no=${data.BOARD_NO }">${data.BOARD_TITLE }</a>
			</td>
			<td>${data.MEMBER_NM }</td>
			<td>${data.BOARD_INDATE }</td>
			<td>${data.BOARD_HITS }</td>
		</tr>
		</c:forEach>
	</table>
	
	<input type="button" value="글쓰기" onclick="boardWriteForm()">
	<br>
	<select name="searchType" id="searchType">
		<option value="title">제목</option>
		<option value="name">작성자</option>
	</select>
		<input type="text" name="searchText" id="searchText">
		<input type="button" value="검색" onclick="searchBoard()">
</body>
</html>