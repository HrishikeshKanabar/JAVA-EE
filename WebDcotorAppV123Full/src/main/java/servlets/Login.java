package servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// import htttp session
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

// import for list
import java.util.*;
// connection  import
import Database.DbConnectionFactory;

// import SQL

import java.sql.*;

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
		
		try {
			List<String>infoRetrunByDatabase=checkCredsandRetuenInfo(email,pass);
			if(infoRetrunByDatabase!=null) {
				
				// Setting attribute or variables of front end
				request.setAttribute("firstName",infoRetrunByDatabase.get(0));
				request.setAttribute("lastName", infoRetrunByDatabase.get(1));
				request.setAttribute("email", infoRetrunByDatabase.get(2));
				
				// Store id in session : 
				HttpSession session = request.getSession();
				session.setAttribute("doc_id",infoRetrunByDatabase.get(3));
				
				// Send request to page profile .jsp to populate this atttribute or variables
				request.getRequestDispatcher("/profile.jsp").forward(request, response);
				
				// Simply redirecting to page
				//response.sendRedirect("/WebDoctorAppV123/profile.jsp").;
				
			}else {
				response.sendRedirect("/WebDoctorAppV123/error.html");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	
	// check for user in database and return firstname , last name , email
	
	 public static List<String> checkCredsandRetuenInfo(String email,String pass) throws SQLException{
		 
		 
		 List<String> info = new ArrayList<String>();
		 
		 // Initialize your databse
		 
		 Connection con = DbConnectionFactory.getConnection();
		 
		 // Create SQL query to check data is there in database or not
		 
		 PreparedStatement mystmt  = con.prepareStatement("SELECT doc_id, doc_fn, doc_ln, doc_email, doc_pass FROM Doctors WHERE doc_pass=? AND doc_email=?");
		 
		 mystmt.setString(1, pass);
		 mystmt.setString(2, email);
		 
		 // result set
		 
		  ResultSet myRs = mystmt.executeQuery();
		  
		  
		  
		  boolean checkRsNext =myRs.next();
		  System.out.println(checkRsNext);
		  
		  if(checkRsNext==true) {
			
			  info.add(myRs.getString("doc_fn"));
			  info.add(myRs.getString("doc_ln"));
			  info.add(myRs.getString("doc_email"));
			  // Add id too
			  info.add(myRs.getString("doc_id"));
		  }
		  else {
			  info=null;
		  }
		  
		  
		  System.out.println(info);
		 
		 return info;
		 
	 }

}
