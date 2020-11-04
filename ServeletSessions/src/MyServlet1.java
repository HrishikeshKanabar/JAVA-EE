import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class MyServlet1 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response){
	     try{
	      response.setContentType("text/html");
	      PrintWriter pwriter = response.getWriter();

	      // get parameters from HTML
	      String name = request.getParameter("userName");
	      String password = request.getParameter("userPassword");
	      
	      
	      pwriter.print("<br>Hello "+name);
	     
	      
	      // Creating new session  and setting attribute
	      HttpSession session=request.getSession();
	      session.setAttribute("uname",name);
	      session.setAttribute("upass",password);
	      
	      pwriter.print("<br><a href='welcome'>view user profile</a>");
	      pwriter.close();
	      
	      
	    }catch(Exception exp){
	       System.out.println(exp);
	     }
	  }
	

}
