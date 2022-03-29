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
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	// Service post
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname = request.getParameter("exampleInputFN1");
		String lname = request.getParameter("exampleInputLN1");
		String email = request.getParameter("exampleInputEmailRegister1");
		String pass = request.getParameter("exampleInputPass1");
		
		System.out.println("fname is : "+ fname + " lname is : "
		                    + lname + " email is :"
		                    + email + " Password is: " + pass);
	}
}
