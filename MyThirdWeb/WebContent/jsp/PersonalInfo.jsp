<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- 		First Name:<%=session.getAttribute("fn") %> <br/> --%>
<%-- 		Middle Name:<%=session.getAttribute("md") %><br/> --%>
<%-- 		Last Name:<%=session.getAttribute("ln") %><br/> --%>
<%-- 		Male :<%=session.getAttribute("gen") %><br/> --%>

<jsp:useBean id="info" class="com.jay.beans.WelcomeOneBean" scope="session"/>

First Name<jsp:getProperty property="firstName" name="info"/><br/>
Last Name<jsp:getProperty property="lastName" name="info"/><br/>
Middle Name<jsp:getProperty property="middleName" name="info"/><br/>
Gender<jsp:getProperty property="gender" name="info"/><br/>



</body>
</html>