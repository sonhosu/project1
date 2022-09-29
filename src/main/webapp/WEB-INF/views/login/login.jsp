<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 화면</h1>
	<form method="post" action="/user/join" >
		<div>아이디:<input type="text"/></div> 
		<div>패스워드:<input type="password"/></div>
		<input type="button" value="로그인"/>
	</form>	
</body>
</html>