<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hai</title>
</head>
<sf:form action="sivaRanjani" modelAttribute="hello">
Username:<sf:input path="username" type="text"/><br>
Password<sf:input path="password" type="password"/><br>
<input type="submit" value="Submit">
</sf:form>
</body>
</html>