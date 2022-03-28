package servlets;

import java.io.IOException;
import java.sql.SQLException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// Package and helper import 
import database.DbConnectionFactory;
import java.sql.*;


@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String eml = request.getParameter("exampleInputEmailSignUp");
		String passw = request.getParameter("exampleInputPasswordSignUp");
		
		//System.out.println(" eml: "+eml+"  passw: "+ passw);
		
		try {
			boolean isValidated=checkCreds(eml,passw);
			 System.out.println(isValidated);
			if(isValidated==true) {
				response.sendRedirect("/WebDoctorApp/profilecard.html");
			}else {
				response.sendRedirect("/WebDoctorApp/loginerror.html");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
	
		
	}
	
	
	// check for signup
	
	public static boolean checkCreds(String eml, String passw) throws ClassNotFoundException, SQLException {
		
		System.out.println(" eml: "+eml+"  passw: "+ passw);
		boolean isCredsCorrect=false;
		
		 // Initialize the database
        Connection con =DbConnectionFactory.getConnection();
		
        // Create a SQL query to insert data into demo table
        // demo table consists of two columns, so two '?' is used
        PreparedStatement myStmt = con
               .prepareStatement("select doctor_id ,doctor_email, doctor_password from "
               		              + "Doctors where doctor_email = ? And doctor_password = ? ");
        
        myStmt.setString(1, eml);
        myStmt.setString(2,passw);
        
        // Result set
        ResultSet myRs = myStmt.executeQuery();
        
        boolean checkRsNext=myRs.next();
        System.out.println("checkRsNext "+checkRsNext);
       
        // Reference for RS next https://docs.oracle.com/javase/7/docs/api/java/sql/ResultSet.html
        // Process the result set
     		
     			if(checkRsNext) {
     				System.out.println("In if loop");
     				
     				isCredsCorrect=true;
     			}
     		
     			
     			
        
        return isCredsCorrect;
		
	}
	

}
