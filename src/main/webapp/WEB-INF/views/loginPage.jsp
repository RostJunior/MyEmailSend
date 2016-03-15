<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LoginPage</title>
</head>
<body>

<h1>Hello and welcome</h1>
<br/>
<c:if test="${'success' eq param.reg}">
		<h2 style="color: green">You have created a new user. Now you can
			login!</h2>
	</c:if>
	
	<c:if test="${'fail' eq param.auth}">
		<h2 style="color: red">Wrong username or password</h2>
	</c:if>
<form action="login" method="POST">
<br/>
<label>Login:</label>
<input type="text" name="emailUser" placeholder="enter your email"></input>
<br/>
<label>Password:</label><br/><br/>
<input type="password" name="passwordUser" placeholder="enter your password"></input><br/>

<button type="submit">Submit</button>

</form>
<br/>
<a href="newUser">create new User</a>

</body>
</html>