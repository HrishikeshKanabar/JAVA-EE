package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Package and helper import 
import database.DbConnectionFactory;
import java.sql.*;



@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    // Explain why we change from get to post
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname = request.getParameter("exampleInputFN1");
		String lname = request.getParameter("exampleInputLN1");
		String email = request.getParameter("exampleInputEmailRegister1");
		String pass = request.getParameter("exampleInputPass1");
		
        //System.out.println("fname: "+fname+" lname: "+lname+" email: "+email+" pass: "+pass);
        
        try {
			boolean isRegestrationDoneCheck= doRegister(fname,lname,email,pass);
			if(isRegestrationDoneCheck==true) {
				 response.sendRedirect("/WebDoctorApp/profilecard.html");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

	public static boolean doRegister(String fname,String lname ,String email ,String pass) throws ClassNotFoundException, SQLException  {
		
		System.out.println("fname: "+fname+" lname: "+lname+" email: "+email+" pass: "+pass);
		
		boolean isRegistrationDone =false;
		
		// Initialize the database
        Connection con =DbConnectionFactory.getConnection();
		
        // Create a SQL query to insert data into demo table
        PreparedStatement myStmt = con
                .prepareStatement("INSERT INTO Doctors (doctor_firstname, doctor_lastname,doctor_email,doctor_password) VALUES (?,?,?,?)");
		
        myStmt.setString(1, fname);
        myStmt.setString(2, lname);
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
