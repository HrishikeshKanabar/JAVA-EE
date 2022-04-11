package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Database.DbConnectionFactory;
import models.Patient;
import java.util.*;
/**
 * Servlet implementation class SearchPatient
 */
@WebServlet("/SearchPatient")
public class SearchPatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Create session object
	    HttpSession session=request.getSession();
		String doc_id =(String)session.getAttribute("doc_id");
		try {
			List<Patient> patientListFromDatabase=getAllDocPatientsInfo(doc_id);
			request.setAttribute("docPatients",patientListFromDatabase);
			request.getRequestDispatcher("/patientSearch.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 public List<Patient> getAllDocPatientsInfo(String doc_id ) throws SQLException {
		 
		 List<Patient> patientList =  new ArrayList<Patient>();
		 
		// Initialize your databse
		 
				 Connection con = DbConnectionFactory.getConnection();
				 
				 // Create SQL query to check data is there in database or not
				 
				 PreparedStatement mystmt  = con.prepareStatement("SELECT pat_id, pat_fn, pat_ln, pat_email, pat_phone,pat_sympt,pat_tests, pat_results, pat_dis, doc_id FROM Patient WHERE doc_id=? ");
				 
				 mystmt.setString(1, doc_id);
				 
				 // result set
				 
				  ResultSet myRs = mystmt.executeQuery();
				  
				  
				  
				
				  
				  while(myRs.next()) {
					  
					  Patient onePatient = new Patient(myRs.getString("pat_fn"),myRs.getString("pat_ln")
							  ,myRs.getString("pat_email"), myRs.getString("pat_phone"),myRs.getString("pat_sympt"),myRs.getString("pat_tests"), 
							   myRs.getString("pat_results"), myRs.getString("pat_dis"),myRs.getString("doc_id"));
					  
					  
					  patientList.add(onePatient);
					  
				  }
				  
		//System.out.println("Patient list" + patientList.get(0).getPat_tests());		  
		 
		 return patientList;
		 
	 }

}
