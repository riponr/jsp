<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@page import="com.java.ri.CollectData,com.java.ri.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="Tlink.jsp"/>

<h1>Student List</h1>  
  
<%  
List<User> list=CollectData.getAllRecords();  
request.setAttribute("list",list);  
%>  

 <table border="1" width="90%">  
<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th>  
<th>JAVA</th><th>C</th><th>PHP</th><th>C++</th><th>C#</th><th>Python</th><th>EDIT</th></tr>  
<c:forEach items="${list}" var="u">  
<tr><td>${u.getId()}</td><td>${u.getUname()}</td><td>${u.getUpass()}</td>  
<td>${u.getUemail()}</td><td>${u.getGrade1()}</td><td>${u.getGrade2()}</td><td>${u.getGrade3()}</td><td>${u.getGrade4()}</td><td>${u.getGrade5()}</td><td>${u.getGrade6()}</td>  
<td><a href="TStudentEdit.jsp?id=${u.getId()}">Edit</a></td></tr>  
</c:forEach>  
</table>  

</body>
</html>