<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>조회수</td>
			<td>추천</td>
			<td>비추천</td>
			<td>날짜</td>
		</tr>
		
		<c:forEach var="board" items="${board }">
		
		<tr>
			<td>${board.board_num }</td>
			<td>${board.board_title }</td>
			<td>${board.board_writer }</td>
			<td>${board.board_view }</td>
			<td>${board.board_up }</td>
			<td>${board.board_down }</td>
			<td>${board.board_date }</td>
		</tr>	
		
		</c:forEach>
		
	</table>

</body>
</html>