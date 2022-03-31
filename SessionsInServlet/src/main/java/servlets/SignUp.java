package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// import pwriter to write HTML inside Java servlet

import java.io.PrintWriter;

// import for http session

import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	// Service
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// request parameters
		
		String em = request.getParameter("email");
		String pass = request.getParameter("userPassword");
		String fn= request.getParameter("fName");
		String schooName= request.getParameter("sName");
		
		// Creating object of pwriter
		
		PrintWriter obj = response.getWriter();
		
		obj.print("<br/> Hello " + fn);
		obj.print("<br/> Welcome to website");
		
		// Creating object for http session
		
		HttpSession objHttpSession = request.getSession();
		
		System.out.println("Object from signup :"+objHttpSession);
		
		// Storing all data in sessions 
		
		objHttpSession.setAttribute("schoolname",schooName);
		objHttpSession.setAttribute("eml",em);
		objHttpSession.setAttribute("fullnm",fn);

		
		
		obj.print("<br/><a href='Profile'> View user profile </a>");
	
	}

}
