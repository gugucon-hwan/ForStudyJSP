<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보입력 폼</title>
</head>
<body>
	<h2>정보입력 폼</h2>
	<form method="post" action="sessionTestPro.jsp">
		아이디 : <input type="text" name="id" maxlength="50"><br>
		패스워드 : <input type="password" name="passwd" maxlength="16"><br>
		<input type="submit" value="정보입력">
	</form>
</body>
</html>