<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가계부 입력</title>
<script type="text/javascript">

</script>
</head>
<body>

	<h1>[ 가계부 입력 ]</h1>
	
	<form action="/board/boardWrite" method="post">
		메모 <input type="text" name="moneybook_memo" id="moneybook_memo"><br>
		분류	<select id="moneybook_type" name="moneybook_type">
				<option value="수입">수입</option>
				<option value="지출">지출</option>
			</select><br>
		금액	<input type="text" id="moneybook_amount" name="moneybook_amount"><br>
		<input type="submit" value="입력하기">
	
	</form>
	
	
</body>
</html>