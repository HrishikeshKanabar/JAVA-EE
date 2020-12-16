import java.io.*;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;


public class ForwardServelet extends HttpServlet{
	
	
String myMsg;
	
	// Initialization
	
	public void init() throws ServletException
	{
		myMsg="HTTP DEMO SERVLET INITIALIZED";
		System.out.println(myMsg);
	}
	
	// Service get,post,put e.t.c 
	
	public void doGet(HttpServletRequest req , HttpServletResponse res)
	throws ServletException,IOException{
		
		List<String> listOfFruits= new ArrayList<String>();
		listOfFruits.add("APPLE");
		listOfFruits.add("BANANA");
		listOfFruits.add("STRAWBERRIES");
		listOfFruits.add("PINEAPPLE");
		listOfFruits.add("GRAPES");
		
		 req.setAttribute("list",listOfFruits);
		 
		 req.getRequestDispatcher("/display.jsp").forward(req, res);
	}
	
	// destroy
	
		public void destroy() {
			System.out.println("HTTP SERVER DESTROYED !!!");
		}
	
	

}
