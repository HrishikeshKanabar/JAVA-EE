package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// Step:2 Import 
import java.io.*;
/**
 * Servlet implementation class AnotherServletDemo
 */
@WebServlet("/AnotherServletDemo")
public class AnotherServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	// Service do get
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		  // Step:-1 
		 response.setContentType("text/html");
		 
		 // Step:-2 Import
		 
		 // Step:-3 Create print writer object  
		 // HTML page with PWRITER
		 
		 PrintWriter object =  response.getWriter();
		 object.println("<h1>ANOTHER WAY TO CALL SERVLET  , I am that servelet </h1>");
	}

	

}
