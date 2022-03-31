package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//import pwriter to write HTML inside Java servlet

import java.io.PrintWriter;

//import for http session

import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Profile
 */
@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	// Service
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Creating printwriter object for HTML page in servlet
		
		PrintWriter objPw = response.getWriter();
		
		//  Creating Http session object
		
		HttpSession objSession = request.getSession();
		
		System.out.println("Object from profile :"+objSession);
		
		
		// retriving data from session
		
		
		
		String fullName =  (String)objSession.getAttribute("fullnm");
		String email =  (String)objSession.getAttribute("eml");
		String SchoolName =  (String)objSession.getAttribute("schoolname");
		
	   objPw.print("<br/> Your full name is : " + fullName );
	   objPw.print("<br/> Your email is : " +  email );
	   
	   objPw.print("<br/> Your school name  is : " +  SchoolName );
		
		
	}

}
