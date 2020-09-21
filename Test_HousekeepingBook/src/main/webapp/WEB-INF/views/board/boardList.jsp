<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가계부</title>
<script type="text/javascript">
	function boardWriteForm(){

	location.href = "/board/boardWriteForm";
	}
</script>
</head>
<body>
	<h1>[ 가계부 ]</h1>
	
	<table border="1">
		<tr>
			<th>번호</th>
			<th>메모</th>
			<th>종류</th>
			<th>금액</th>
			<th>작성일</th>
			<th></th>
			<th></th>
		</tr>
		
		<c:choose>
			<c:when test="${not empty list }">
				<c:forEach items="${list }" var="board">
					<tr>
					<td>${board.moneybook_no }</td>
					<td>${board.moneybook_memo }</td>
					<td>${board.moneybook_type }</td>
					<td>${board.moneybook_amount }</td>
					<td>${board.moneybook_indate }</td>
					<td><input type="button" value="수정"> </td>
					<td><input type="button" value="삭제"> </td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
			<tr>
					<td colspan="7">등록된 데이터가 없습니다.<td>
			</tr>	
			</c:otherwise>
		</c:choose>
		
	</table>
	<input type="button" value="가계부 작성" onclick="boardWriteForm()"><br>
	<select id="moneybook_type">
		<option value="all">전체</option>
		<option value="input">수입</option>
		<option value="output">지출</option>
	</select>
	<input type="text" id="searchText" placeholder="검색어 입력">
	<input type="button" value="검색" onclick="searchBoard()"><br>

	<form action="/board/boardList" method="get" id="searchForm">
		<input type="hidden" name="searchType" id="type">
		<input type="hidden" name="searchText" id="text">
	</form>
	
	<input type="button" value="총 수입 구하기">
	<input type="button" value="총 지출 구하기">
	<input type="text" id="sum" placeholder="총 수입 또는 총 지출"><br>
	<input type="button" value="최소금액 구하기">
	<input type="button" value="최대금액 구하기">
	<input type="text" id="minmax">
	
</body>
</html>