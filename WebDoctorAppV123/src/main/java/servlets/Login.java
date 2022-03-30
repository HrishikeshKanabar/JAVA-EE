package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Step:1 import servlet config to get name of servlet and servlet context to get context parameter

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
/**
 * Servlet implementation class Register
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	// Service do get
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Use name attribute in request get parameter
		
		String email = request.getParameter("exampleInputEmail1");
		String pass= request.getParameter("exampleInputPassword1");
		
		
		System.out.println("EMAIL IS: "+ email + " PASWORD IS: "+ pass);
		
		// Step-2 display name of servlet with servlet config and servlet context parameter
		
		// // Creating object from class "ServletConfig"
		
		ServletConfig object = getServletConfig();
		
		String servletName = object.getServletName();
		
		System.out.println(servletName + " has been called");
		
		// // Creating object from class "ServletContext"
		
		ServletContext objectContext = getServletContext();
		
		String author =  objectContext.getInitParameter("Author");
		String version=  objectContext.getInitParameter("Version");
		String appName = objectContext.getInitParameter("AppName");
	
		
		System.out.println("The app name is : " + appName + " "+ author + "@"+version);
	
	}

}
