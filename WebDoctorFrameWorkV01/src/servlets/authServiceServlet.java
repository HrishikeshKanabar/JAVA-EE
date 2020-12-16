package servlets;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.*;
import javax.servlet.http.*;
import helper.authStore;


public class authServiceServlet  extends HttpServlet{
	
	
	// Creating Http servlet by extending HttpServlet class


	
		String myMsg;
		
		// Initialization
		
		public void init() throws ServletException
		{
			myMsg="HTTP AUTH SERVICE SERVLET INITIALIZED";
			System.out.println(myMsg);
		}


		// Service get,post,put e.t.c 
		
		public void doGet(HttpServletRequest req , HttpServletResponse res)
		throws ServletException,IOException{
			
			// Setting up type response content
			
			res.setContentType("text/html");
			
			// Writting HTML in Java (Message to diaplay in web page)
			
			PrintWriter pri = res.getWriter();
			
			// get parameters from HTML
			
			String name = req.getParameter("uname");
			String password = req.getParameter("psw");
			
			authStore authObj = new authStore();
			
			// Map to store return
			
			Map<String ,String> usrPsw = new HashMap<String,String>();
			
			
			usrPsw=authObj.authgenerator(name);
			//String pss = usrPsw.get(name);
			//System.out.print("Pass: "+pss);
			
			if(usrPsw.containsValue(password)) {
				
				//pri.print("<br/>Hello I AM LOGGED IN" );
				res.sendRedirect("/WebDoctorFrameWorkV01/loginSuccess.jsp");
				
				
			}else {
				
				//pri.print("<br/>Hello , Loggin faied !!" );
				res.sendRedirect("/WebDoctorFrameWorkV01/loginFailed.jsp");
				
			}

		}


		// destroy
		
		public void destroy() {
			System.out.println("HTTP SERVER DESTROYED !!!");
			
		}

}
