<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String n = request.getParameter("tname");
String p = request.getParameter("tpassword");


if(n.equals("teacher") && p.equals("teacher123")){
	out.print("welcome "+n);
	session.setAttribute("name", n);
	
	%>
	
	<jsp:include page="Tlink.jsp" />     
	
	<% 
}
else{
	out.print("user name or password error");
	%>
	<jsp:include page="Tlogin.jsp" /> 
<% 
}
%>

</body>
</html>