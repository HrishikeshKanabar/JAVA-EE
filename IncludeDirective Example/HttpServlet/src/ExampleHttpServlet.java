import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
// Creating Http Servlet by Extending HttpServlet class


public class ExampleHttpServlet extends HttpServlet {
	
	
	 private String mymsg;
	 
	   // Initialization
	 
	    public void init() throws ServletException 
	    {      
	       mymsg = "Http Servlet Demo";   
	    }
	    
	    
	    // Service get,post e.t.c.
	    
	    public void doGet(HttpServletRequest request, 
	        HttpServletResponse response) throws ServletException, 
	        IOException 
	    {            
	        // Setting up the content type of web page      
	        response.setContentType("text/html");
	        // Writing the message on the web page      
	        PrintWriter out = response.getWriter();      
	        out.println("<h1>" + mymsg + "</h1>");      
	        out.println("<p>" + "Hello Friends!" + "</p>");   
	    }
	    
	    
	    // Destroy
	    
	    
	    public void destroy() 
	    {      
	       // Leaving empty. Use this if you want to perform  
	       //something at the end of Servlet life cycle.   
	    }

}
