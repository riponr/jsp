<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@page import="com.java.ri.Login"%>  
<jsp:useBean id="obj" class="com.java.ri.LoginBean"/>  
  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
String n = request.getParameter("name");
String p = request.getParameter("password");

if(Login.validate(n, p) ){
	
	// RequestDispatcher rd = request.getRequestDispatcher("/EmployeeView.html");
	//	rd.include(request, response);
		out.print("<br>");
	out.print("Login successful ");
	out.print("<br>");
	out.print("welcome "+n);
	out.print("<br>");
	
	session.setAttribute("name", n);
	
	%>
	
	<a href="StudentProfile.jsp">profile</a> 
	
	<br>
	<br>
	
	<a href="Logout.jsp">Logout</a> 
	
	<% 
}
else{
	out.print("user name or password error");
	
}
%>  

</body>
</html>