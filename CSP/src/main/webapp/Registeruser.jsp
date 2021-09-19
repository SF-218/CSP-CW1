<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
<form action="RegisterUserServlet" method="post">
 ID:<input type="number" name="id"/><br/>
 Name:<input type="text" name="name"/><br/>
 Password:<input type="password" name="password"/><br/>
 Email Id:<input type="text" name="email" /><br/>
 Gender:<select name="gender">
 <option>Male</option>
 <option>Female</option>
 </select> <br/>
 Date of Birth:<input type="date" name="dob"/><br/>
 Race:<input type="text" name="race" /><br/>
 Nationality:<input type="text" name="citizenship" /><br/>
 Education:<input type="text" name="education" /><br/>
 Description:<input type="text" name="description" /><br/>
 <a href='index.jsp'><input type="submit" value="Submit"/></a>
 </form>

</body>
</html>