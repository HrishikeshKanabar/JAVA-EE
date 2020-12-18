import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;



public class ServSec extends HttpServlet {
	
     String myMsg;
	
	// Initialization
	
	public void init() throws ServletException
	{
		myMsg="HTTP DEMO SERVLET 1 INITIALIZED";
		System.out.println(myMsg);
	}
	
	
	// service 
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		
		
        
		try {
			
			res.setContentType("text/html");
			PrintWriter pwriter = res.getWriter();
			
			// get parameters from HTML
			
			String name = req.getParameter("userName");
			String password = req.getParameter("userPassword");

			//URL ENCODE.

	        String servletURL = res.encodeURL("ServSec");
	        
			
			
			pwriter.print("<br/>Hello"+name);
			
			
			pwriter.close();
			
		}catch(Exception exp) {
			
			System.out.println(exp);
			
		}
		
		
		
	}
	
	
	// destroy
	
		public void destroy() {
			System.out.println("HTTP SERVLET 1 DESTROYED !!!");
		}
		
	
	

}
