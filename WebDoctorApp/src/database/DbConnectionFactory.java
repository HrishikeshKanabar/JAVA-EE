package database;

import java.sql.*;


public class DbConnectionFactory {
	
	
	
	
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		
	
		
		// 1. Get a connection to database
		Connection myConn = DriverManager.getConnection("jdbc:mysql://uyhqpodpprmifptz:bPjDAuomWNoK0Z1RJbs8@by97bvjhvtv1sevgmnkk-mysql.services.clever-cloud.com:3306/by97bvjhvtv1sevgmnkk");
	    
		
		System.out.println(myConn);
		
		return myConn;

	}
	
 /* to test add  */
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		 
		 getConnection();
	}

}


