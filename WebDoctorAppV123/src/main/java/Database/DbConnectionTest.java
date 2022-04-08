package Database;
// Step-1 import java sql
import java.sql.*;

public class DbConnectionTest {

	public static void main(String[] args) throws SQLException {
		 
		// Step-2 Intialiaze
		
		Connection myConn =null;
		Statement myStmt =null;
		ResultSet myRs=null;
		// Add throws SQLException
		
		
		// Using try catch for production database connection
		try {
			
			// Step-3 Get connection of your data base
			
			myConn = DriverManager.getConnection("jdbc:mysql://uqouacmcwiib9ke0:X5hht6h63YDn2No7z0H6@bfdd4xaltvgpiroxddcw-mysql.services.clever-cloud.com:3306/bfdd4xaltvgpiroxddcw");
			
			System.out.println("Connection Successfull!");
			
			// Step-4 Create statement
			
			myStmt = myConn.createStatement();
		    
		   // Step-5  Excecute query
			myRs = myStmt.executeQuery("SELECT * FROM Doctors");
		
		 // myRs contains more than one record
			
			while(myRs.next()) {
				System.out.print(myRs.getString("doc_id")+" ");
				System.out.print(myRs.getString("doc_fn")+" ");
				System.out.print(myRs.getString("doc_ln")+" ");
				System.out.print(myRs.getString("doc_email")+" " + " \n");
			}
			
					
					
		}catch(Exception el) {
			el.printStackTrace();
			
		}
		
		
		

	}

}
