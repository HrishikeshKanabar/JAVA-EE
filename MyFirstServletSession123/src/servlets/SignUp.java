package servlets;


import java.io.*;
import javax.servlet.http.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			  response.setContentType("text/html");
		      PrintWriter pwriter = response.getWriter();

		      // get parameters from HTML
		      String email= request.getParameter("email");
		      String passw =request.getParameter("userPassword");
		      String fname =request.getParameter("fName");
		      String sname =request.getParameter("sName");
		      
		      
		      pwriter.print("<br>Hello "+fname);
		      pwriter.print("<br/>Welcome to website");
		      
		      
		      // Creating new session  and setting attribute
		      HttpSession session=request.getSession();
		      session.setAttribute("fullname",fname);
		      session.setAttribute("scholname",sname);
		      session.setAttribute("useremail",email);
		      // Link to call another server profile
		      pwriter.print("<br><a href='Profile'>view user profile</a>");
		      
		}catch(Exception exp) {
			
		}
		
	}

	

}
