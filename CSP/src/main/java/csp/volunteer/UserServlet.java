package csp.volunteer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DatabaseUser userDatabase;
       
	
	public void init() {
		userDatabase = new DatabaseUser();
    } 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        //System.out.println("reach");
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
		
		String name = request.getParameter("name");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dob");
        String race = request.getParameter("race");
        String citizenship = request.getParameter("citizenship");
        String education = request.getParameter("education");
        String description = request.getParameter("description");
        UserProfile user = new UserProfile();
        /*user.setName(name);
        user.setEmail(email);
        user.setGender(gender);
        user.setDob(dob);
        user.setRace(race);
        user.setCitizenship(citizenship);
        user.setEducation(education);
        user.setDescription(description);*/
        
        PrintWriter writer = response.getWriter();
        writer.println(name);
        writer.println(email);
        writer.println(gender);
        writer.println(dob);
        writer.println(race);
        writer.println(citizenship);
        writer.println(education);
        writer.println(description);
        writer.close();

        try {
            if (userDatabase.validate(user)) {
                //HttpSession session = request.getSession();
                // session.setAttribute("name",name);
                response.sendRedirect("Profile.jsp");
            } else {
                HttpSession session = request.getSession();
                //session.setAttribute("user", name);
                response.sendRedirect("Portal.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
	}

}
