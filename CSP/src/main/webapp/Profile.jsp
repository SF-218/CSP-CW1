<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Details</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/UserServlet" method="get">
 Name: <br/>
 Email: <br/>
 Gender: <br/>
 Date of Birth: <br/>
 Race: <br/>
 Citizenship: <br/>
 Education: <br/>
 Description: <br/>
 

  
 <input type="submit" value="Submit"/>
 <input type="submit" value="Update"/>
 <input type="submit" value="Delete"/>
</form>
</body>
</html>