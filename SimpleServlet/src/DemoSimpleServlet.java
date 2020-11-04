
import java.io.*;
import javax.servlet.*;


public class DemoSimpleServlet implements Servlet {

	
	
	
	 ServletConfig config=null;
	 
	   // Initialization
	 
	   public void init(ServletConfig config){
	      this.config=config;
	      System.out.println("Initialization complete");
	   }

	   
	   // Service
	   
	   public void service(ServletRequest req,ServletResponse res)
	   throws IOException,ServletException{
	       
		   res.setContentType("text/html");
	       
		   PrintWriter pwriter=res.getWriter();
		   
	       pwriter.print("<html>");
	       pwriter.print("<body>");
	       pwriter.print("<h1>Servlet Example Program</h1>");
	       pwriter.print("</body>");
	       pwriter.print("</html>");
	   }
	   
	   
	   // destroy
	   
	   public void destroy(){
	       System.out.println("servlet life cycle finished");
	   }
	   
	   // servlet config 
	   public ServletConfig getServletConfig(){
	       return config;
	   }
	   
	   // servlet info 
	   
	   public String getServletInfo(){
	       return "A Demo program written by Hrishi";
	   }
}
