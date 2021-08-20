package calci;
import java.io.*;

import javax.servlet.ServletException;
//class HTTP servlet in this library
import javax.servlet.http.*;

public class CalServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		int result = 0;
		// what kind of response you want
	
						
				res.setContentType("text/html");
				try {
				//   className    object name 	  response method that returns PrintWriter object
					PrintWriter pWriterObj =  res.getWriter();
					
					
					String num1 = req.getParameter("number1");
					String num2 = req.getParameter("number2");
					String operator = req.getParameter("op");
					int x = Integer.parseInt(num1);
					int y = Integer.parseInt(num2);
					
					    if(operator.equals("add")) {
						result = x + y;
						}
						else if(operator.equals("sub")) {
						result = x - y;
						}
						else if(operator.equals("mul")) {
						result = x * y;
						}
						else if(operator.equals("div")) {
						result = x/y;
						}
						else {
					    	pWriterObj.write("ERROR:PLEASE SELECT CORRECT OPERATIONS");
					    }    
					
					
					//req.setAttribute("results", result);
				    //req.getRequestDispatcher("index.jsp").forward(req, res);  
					    
				
					
					pWriterObj.write("<html>");
					pWriterObj.write("<body>");
					pWriterObj.write("SLECTED OPERATION IS: " + operator);
					pWriterObj.write("<h1>THE ANSWER IS :</h1>" + result);
					pWriterObj.write("</body>");
					pWriterObj.write("</html>");
					
					
					
				}catch(IOException e) {
					 e.printStackTrace();
				} 
				
				/*catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} */
		
	}

}
