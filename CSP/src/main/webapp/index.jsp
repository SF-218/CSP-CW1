<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CSP Login</title>
</head>
<body background="https://us.123rf.com/450wm/artqu/artqu1607/artqu160700042/61574598-health-care-design-vector.jpg?ver=6">

<form action="<%=request.getContextPath()%>/login" method="post">
            <center>
            <table border="0" width="30%" cellpadding="3">
                <thead>
                    <tr>
                        <th colspan="2">Login Page</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="userName" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="password" value="" /></td>
                    </tr>
                    <tr>
                        <td><a href="Portal.jsp"><input type="submit" value="Login" /></a></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                    <tr>
                        <td><a href="Registeruser.jsp">Register Here</a></td>
                    </tr>
                </tbody>
            </table>
            </center>
        </form>


</body>
</html>