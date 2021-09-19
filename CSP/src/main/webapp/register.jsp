<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Volunteer Registry</title>
</head>
<body>

<form action="RegisterServlet" method="post">
 ID:<input type="number" name="id"/><br/>
 Name:<input type="text" name="name"/><br/>
 Gender:<select name="gender">
 <option>Male</option>
 <option>Female</option>
 </select> <br/>
 Date of Birth:<input type="date" name="dob"/><br/>
 Race:<input type="text" name="race" /><br/>
 Citizenship:<input type="text" name="citizenship" /><br/>
 Email Id:<input type="text" name="email" /><br/>
 Education:<input type="text" name="education" /><br/>
 Description:<input type="text" name="description" /><br/>
 <input type="submit" value="Submit"/>
 </form>

</body>
</html>