<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" prefix="form"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${'wrongpass' eq param.reg}">
		<h1 style="color: red">Password mismatch</h1>
	</c:if>
<h1>Your hawe creating new User</h1><br/>
<%-- <form:form action="newUser" method="POST">
<label>Enter Email:</label><br/>
<form:input path="email" name="emailUser" required/><br/>
<label>Enter Password:</label><br/>
<form:input path="password" name="passwordUser" required/><br/>
<label>Enter Name:</label><br/>
<form:input path="text" name="nameUser"/><br/>
<label>Enter Telephone:</label><br/>
<form:input path="text" name="telephoneUser" /><br/>
<label>Enter Role:</label><br/> --%>

<form action="${pageContext.request.contextPath}/newUser" method="POST">
<label>Enter Email:</label><br/>
<input type="email" name="emailUser" required/><br/>
<label>Enter Password:</label><br/>
<input type="password" name="passwordUser" required/><br/>
<label>Repeat password:</label><br/> 
<input type="password" name="passwordUserRepeat" required /><br/>
<label>Enter Name:</label><br/>
<input type="text" name="nameUser"/><br/>
<label>Enter Telephone:</label><br/>
<input type="text" name="telephoneUser" /><br/>

<button type="submit">Add new User</button>

</form>

</body>
</html>