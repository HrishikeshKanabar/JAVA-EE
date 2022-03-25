package servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Adding import to write HTML page in JAVA
// Step-2 
import java.io.PrintWriter;

/**
 * Servlet implementation class FirstServletDemo
 */
@WebServlet("/FirstServletDemo")
public class FirstServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    // 18-24 line removed always as they are unused

	
	 // This is initialization of servlet
	 // inti method will exececute when servlet is intialized
	
	public void init(ServletConfig config) throws ServletException {
		System.out.print("HEY I AM BORN  , HAPPY BIRTHDAY !!");
	}


	 

   // Service method , Get service 
   // Get dynamic page
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	       // Step:-1 respose (setContentype) set content of page to be returne
		
		  response.setContentType("text/html");
		  
		   // Step-2 is to import 
		  
		  
		   // Step - 3 is to write html page
		  
		  // ClassName  objectname   = respone.getWriter
		  
		  PrintWriter anyName =  response.getWriter();
		  
		  // HTML way
		  
		  /*
		   <html>
		   <title>FIRST SERVLET</title>
		   <body>
		   <font color='green'>HELLO FROM FIRST SERVLET</font>
		   </body>
		   </html>
		   */
		  
		  
		  // Servlet way
		  anyName.println("<html><title>FIRST SEVLET</title><body>");
		  
		  // Note : Use escape character as single quote inside double quote
		  anyName.println("<font color='green'>HELLO FROM FIRST SERVLET</font>");
		  
		  
		  anyName.println("</body></html>");
		  
		  
	}
	
	
	 // Destroy  . 
	 // This method will be called when we destroy Servlet
	
	public void destroy() {
			System.out.print("OH I AM DYING .... HELP ");
		}

}
