
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class DemoServlet extends HttpServlet {

	
	
	protected void doGet(HttpServletRequest request, 
		      HttpServletResponse response)
		        throws ServletException, IOException 
		   {

		      response.setContentType("text/html;charset=UTF-8");
		      PrintWriter pwriter = response.getWriter();
		      
		      ServletConfig sc=getServletConfig();    // object
		      
		      //Returns the name of the servlet instance
		      
		      String name = sc.getServletName();
		      
		      //System.out.println("Servelet from name "+name);

		      pwriter.println("<br>Servlet Name: "+name);
		      
		      String paramName = getInitParameter("MyName");
		      
		      pwriter.println("<br>Parameter Name: "+paramName);
		   }
}
