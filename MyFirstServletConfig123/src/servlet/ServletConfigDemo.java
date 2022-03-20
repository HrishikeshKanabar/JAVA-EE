package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
  

/**
 * Servlet implementation class ServletConfig
 */
@WebServlet("/ServletConfigDemo")
public class ServletConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	// inti
		public void init(ServletConfigDemo config) throws ServletException {
			
			System.out.println("Hey I am intialized");
			
		}

		
		
	   // Service
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				response.setContentType("text/html;charset=UTF-8");
				      PrintWriter pwriter = response.getWriter();
				      
				      
				      ServletConfig config=getServletConfig();    // object
				      
				//Returns the name of the servlet instance
				String name = config.getServletName();
				pwriter.println("<br>Servlet Name: "+name);
				
				// context
				   //ServletContext object creation
				   ServletContext scontext=getServletContext();   
				   
				   
				   
				   
				      
				  
				  //fetching values of initialization parameters and printing it
				   String userName=scontext.getInitParameter("MyName");
				   pwriter.println("<br> My name is="+userName);
				   String userEmail=scontext.getInitParameter("MySchool");
				   pwriter.println("<br> School is="+userEmail);
							      
							  
							    
			      
		    
		      
		      
		}
		
		// destroy
		
		public void destroy() {
			System.out.println("Bye, bye I am destroyed");
		}

}
