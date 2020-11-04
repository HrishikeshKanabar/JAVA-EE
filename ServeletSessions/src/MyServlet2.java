import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class MyServlet2 extends HttpServlet {
	
	  public void doGet(HttpServletRequest request, HttpServletResponse response){
		  try{
		      response.setContentType("text/html");
		      PrintWriter pwriter = response.getWriter();
		      
		      // Create session object
		      HttpSession session=request.getSession(false);
		      
		      // retriving attribute that are stored in session
		      String myName=(String)session.getAttribute("uname");
		      String myPass=(String)session.getAttribute("upass");
		      
		      
		      pwriter.print("<br>Name of user : "+myName+" and Password is : "+myPass);
		      pwriter.close();
		  }catch(Exception exp){
		      System.out.println(exp);
		   }
		  }

}
