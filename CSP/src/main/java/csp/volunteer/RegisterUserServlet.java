package csp.volunteer;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterUserServlet
 */
@WebServlet("/RegisterUserServlet")
public class RegisterUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 String j = request.getParameter("id");
		 String a = request.getParameter("name");
		 String b = request.getParameter("password");
		 String c = request.getParameter("email");
		 String d = request.getParameter("gender");
		 String e = request.getParameter("dob");
		 String f = request.getParameter("race");
		 String g = request.getParameter("citizenship");
		 String h = request.getParameter("education");
		 String k = request.getParameter("description");
		
		 try {
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection(
		 "jdbc:mysql://localhost:3306/mydb", "root", "");
		 PreparedStatement ps = con.prepareStatement("insert into USER values(?,?,?,?,?,?,?,?,?,?)");
		 ps.setString(1, j);
		 ps.setString(2, a);
		 ps.setString(3, b);
		 ps.setString(4, c);
		 ps.setString(5, d);
		 ps.setString(6, e);
		 ps.setString(7, f);
		 ps.setString(8, g);
		 ps.setString(9, h);
		 ps.setString(10,k);
		 
		 int i = ps.executeUpdate();
		 if (i > 0)
		// out.print("You are successfully registered...");
		 response.sendRedirect("index.jsp");
		 } catch (Exception e2) {
		 System.out.println(e2);
		 }
		 out.close();
	}

}
