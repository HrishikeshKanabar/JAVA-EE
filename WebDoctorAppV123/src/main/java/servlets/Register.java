package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Step-1 import servlet config and Servlet context

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
/**
 * Servlet implementation class Register
 */
// imported SQL 
import java.sql.*;
// import that DbConnection Factory class
import Database.DbConnectionFactory;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	// Service post
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname = request.getParameter("exampleInputFN1");
		String lname = request.getParameter("exampleInputLN1");
		String email = request.getParameter("exampleInputEmailRegister1");
		String pass = request.getParameter("exampleInputPass1");
		
		System.out.println("fname is : "+ fname + " lname is : "
		                    + lname + " email is :"
		                    + email + " Password is: " + pass);
		
		// To set variable on front end
		
		
		// Step-2 Display name of Servlet
		
		// Creating object from class "ServletConfig"
		
		ServletConfig obj = getServletConfig();  
		
		String servName = obj.getServletName();
		
		System.out.println(servName + " has been called");
		
		// Create object from class "ServletContext"
		
		ServletContext objectContext = getServletContext();
		
		String author =  objectContext.getInitParameter("Author");
		String version=  objectContext.getInitParameter("Version");
		String appName = objectContext.getInitParameter("AppName");
		
		System.out.println("The app name is : " + appName + " "+ author + "@"+version);
		
		try {
			boolean isRegistrationDoneCheck = doRegister(fname,lname,email,pass);
			if(isRegistrationDoneCheck==true) {
				
				request.setAttribute("firstName",fname);
				request.setAttribute("lastName", lname);
				request.setAttribute("email", email);
				// Send request to page profile .jsp to populate this atttribute or variables
				request.getRequestDispatcher("/profile.jsp").forward(request, response);
				// Simply redirecting to page
				//response.sendRedirect("/WebDoctorAppV123/profile.jsp").;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
	// do Register method will return us true 
	
	public static boolean doRegister(String fn , String ln , String email ,String pass) throws SQLException {
		
		boolean isRegistrationDone=false;
		
		// Register in database with help of connection factory
		
		Connection myConn =DbConnectionFactory.getConnection();
		
		// Create insert statement
		
		PreparedStatement myStmt = myConn.prepareStatement("INSERT  INTO Doctors (doc_fn,doc_ln,doc_email,doc_pass) VALUE(?,?,?,?)");
		
		myStmt.setString(1, fn);
		myStmt.setString(2, ln);
		myStmt.setString(3, email);
		myStmt.setString(4, pass);
		
		
		// Excecute query
		int row = myStmt.executeUpdate();
		
		// rows affected
		
		System.out.println(row); //1
		
		if(row==1) {
			isRegistrationDone=true;
		} 
		
		
		return isRegistrationDone;
		
		
	}
}
