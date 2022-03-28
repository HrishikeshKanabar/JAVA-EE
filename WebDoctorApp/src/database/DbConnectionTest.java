package database;
import java.sql.*;

public class DbConnectionTest {

	public static void main(String[] args) throws SQLException {

	Connection myConn = null;
	Statement myStmt = null;
	ResultSet myRs = null;
	
	try {
		// 1. Get a connection to database
		myConn = DriverManager.getConnection("jdbc:mysql://uyhqpodpprmifptz:bPjDAuomWNoK0Z1RJbs8@by97bvjhvtv1sevgmnkk-mysql.services.clever-cloud.com:3306/by97bvjhvtv1sevgmnkk");
		
		System.out.println("Database connection successful!\n");
		
		// 2. Create a statement
		myStmt = myConn.createStatement();
		
		// 3. Execute SQL query
		myRs = myStmt.executeQuery("SELECT * FROM Doctors");
		
		// 4. Process the result set
		while (myRs.next()) {
			System.out.println(myRs.getString("doctor_firstname") + ", " + myRs.getString("doctor_email"));
		
		}
		}catch(Exception exc) {
			exc.printStackTrace();
		}finally {
			if (myRs != null) {
				myRs.close();
			}
			
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();
			}
		}
	
	}
  
	
}
