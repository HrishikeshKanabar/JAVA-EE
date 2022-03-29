package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	// Service do get
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Use name attribute in request get parameter
		
		String email = request.getParameter("exampleInputEmail1");
		String pass= request.getParameter("exampleInputPassword1");
		
		
		System.out.println("EMAIL IS: "+ email + " PASWORD IS: "+ pass);
		
	
	}

}
