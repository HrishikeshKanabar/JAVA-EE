package servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// Added import Print writer
import java.io.PrintWriter;

/**
 * Servlet implementation class MyHttpServlet1
 */
@WebServlet("/MyHttpServlet1")
public class MyHttpServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	// inti
	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("Hey I am intialized");
		
	}

	
	
   // Service
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 out.println("<html><body>");
		 out.println("<font color='green'> Hey I am your HTTP SERVELET</font>");
		 out.println("</body></html>");
		 
	}
	
	// destroy
	
	public void destroy() {
		System.out.println("Bye, bye I am destroyed");
	}
}
