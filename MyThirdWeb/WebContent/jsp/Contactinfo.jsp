<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact info</title>
</head>
<body>

<%-- Address:<%=session.getAttribute("ad") %><br/> --%>
<%-- City:<%=session.getAttribute("city") %><br/> --%>
<%-- State:<%=session.getAttribute("state") %><br/> --%>
<%-- Country:<%=session.getAttribute("country") %><br/> --%>
<%-- Phone:<%=session.getAttribute("phone") %><br/> --%>

<jsp:useBean id="info" class="com.jay.beans.ContactBean" scope="session"/>
Address:	<jsp:getProperty property="address" name="info"/><br/>
City:	<jsp:getProperty property="city" name="info"/><br/>
State:	<jsp:getProperty property="state" name="info"/><br/>
Country:	<jsp:getProperty property="country" name="info"/><br/>
Phone	<jsp:getProperty property="phone" name="info"/><br/>


</body>
</html>