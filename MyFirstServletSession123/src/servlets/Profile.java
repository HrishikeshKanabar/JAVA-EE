package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;
import java.io.*;



@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      
		 try{
		  response.setContentType("text/html");
	      PrintWriter pwriter = response.getWriter();
	      
	      // Create session object
	      HttpSession session=request.getSession(false);
	      
	      // retriving attribute that are stored in session
	      String myName=(String)session.getAttribute("fullname");
	      String email=(String)session.getAttribute("useremail");
	      String sname =(String)session.getAttribute("scholname");
	      
	      pwriter.print("<br>Your fullname is  : " + myName +"<br/>");
	      pwriter.print("<br>Your email is  : " +email +"<br/>");
	      pwriter.print("<br>Your school name is : "+sname+"<br/>");
	      
	      pwriter.close();
	      
	      
	  }catch(Exception exp){
	      System.out.println(exp);
	   }
	  
	}

	

}
