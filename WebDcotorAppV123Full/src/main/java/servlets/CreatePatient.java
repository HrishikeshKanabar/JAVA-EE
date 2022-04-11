package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// import htttp session
import javax.servlet.http.HttpSession;

import Database.DbConnectionFactory;
import models.Patient;

/**
 * Servlet implementation class CreatePatient
 */
@WebServlet("/CreatePatient")
public class CreatePatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	
		String pat_fn = request.getParameter("exampleInputFN1");
		String pat_ln  = request.getParameter("exampleInputLN1");
		String pat_email = request.getParameter("exampleInputEmailRegister1");
		String pat_phone  = request.getParameter("exampleInputPhone1");
		String pat_sympt  = request.getParameter("Symtopms");
		String pat_tests  = request.getParameter("tests");
		String pat_results  = request.getParameter("Results");
		String pat_dis  = request.getParameter("Disease");  
		 
		// Create session object
	    HttpSession session=request.getSession();
		String doc_id =(String)session.getAttribute("doc_id");
		
		System.out.println(pat_fn + "" + pat_ln + " " +pat_email + " " +pat_phone+" "+pat_sympt+" "+pat_tests
				+" "+pat_results+" "+pat_dis+" "+doc_id);
		

		// Step-2 Display name of Servlet
		
		// Creating object from class "ServletConfig"
		
		ServletConfig obj = getServletConfig();  
		
		String servName = obj.getServletName();
		
		System.out.println(servName + " has been called");
		
		try {
			boolean isCreatedPatientCheck = doCreatePatient(pat_fn,pat_ln,pat_email,pat_phone, pat_sympt,pat_tests,pat_results, pat_dis,doc_id);
			if(isCreatedPatientCheck==true) {
				List<Patient> patientListFromDatabase=getAllDocPatientsInfo(doc_id);
				request.setAttribute("docPatients",patientListFromDatabase);
				request.getRequestDispatcher("/patientSearch.jsp").forward(request, response);
			}
		}catch (SQLException e) {
			
			
			
			e.printStackTrace();
		}
			
		
	}
	
	
	// do Create patient method will return us true 
	
		public static boolean doCreatePatient(String pat_fn,String pat_ln,String pat_email,String pat_phone,String pat_sympt,String pat_tests,String pat_results,String pat_dis,String doc_id) throws SQLException {
			
			boolean isPatientCreated=false;
			
			// Register in database with help of connection factory
			
			Connection myConn =DbConnectionFactory.getConnection();
			
			// Create insert statement
			
			PreparedStatement myStmt = myConn.prepareStatement("INSERT  INTO Patient (pat_fn,pat_ln,pat_email,pat_phone,pat_sympt,pat_tests,pat_results,pat_dis,doc_id) VALUE(?,?,?,?,?,?,?,?,?)");
			
			myStmt.setString(1,  pat_fn);
			myStmt.setString(2, pat_ln);
			myStmt.setString(3, pat_email);
			myStmt.setString(4, pat_phone);
			myStmt.setString(5, pat_sympt);
			myStmt.setString(6, pat_tests);
			myStmt.setString(7,pat_results);
			myStmt.setString(8,pat_dis);
			myStmt.setString(9,doc_id);
			// Excecute query
			int row = myStmt.executeUpdate();
			
			// rows affected
			
			System.out.println(row); //1
			
			if(row==1) {
				isPatientCreated=true;
			} 
			
			
			return isPatientCreated;
			
			
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
