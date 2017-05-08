<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@page import="com.java.ri.CollectData,com.java.ri.User"%>

<%  
String id=request.getParameter("id");  
User u=CollectData.getdata(Integer.parseInt(id));  
%>  

<h1>Student Edit Form</h1>  
<form action="StudentEdit1.jsp" method="post">  
<input type="hidden" name="id" value="<%=u.getId() %>"/>  
 
<input type="hidden" name="uname" value="<%= u.getUname()%>"/> 
 
<input type="hidden" name="grade1" value="<%= u.getGrade1()%>"/> 

<input type="hidden" name="grade2" value="<%= u.getGrade2()%>"/>

<input type="hidden" name="grade3" value="<%= u.getGrade3()%>"/>

<input type="hidden" name="grade4" value="<%= u.getGrade4()%>"/>

<input type="hidden" name="grade5" value="<%= u.getGrade5()%>"/> 
 
<input type="hidden" name="grade6" value="<%= u.getGrade6()%>"/>   

<table> 
<tr><td>Password:</td><td> 
<input type="text" name="uemail" value="<%= u.getUpass()%>"/></td></tr>  
 <tr><td>Email:</td><td>  
<input type="email" name="upass" value="<%= u.getUemail()%>"/></td></tr> 
  
<tr><td colspan="2"><input type="submit" value="Edit User"/></td></tr>  
</table>  
</form> 

</body>
</html>