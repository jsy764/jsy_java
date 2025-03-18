<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id=signIn>
	<form method="post" action="save.jsp">
		제목 : <input type="text" name="title"> <br>
		작성자 : <input type="text" name="author"> <br>
		내용 : <input type="text" name="content"> <br>
		작성일 : <input type="date" name="date"> <br>
		<button>가입</button>
	</form>
	</div>
</body>
</html>