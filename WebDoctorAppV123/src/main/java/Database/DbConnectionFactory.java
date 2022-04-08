package Database;
// Step:1 import java sql
import java.sql.*;

public class DbConnectionFactory {
	
	  // Description : This method gives us or return us connection object
      // return type: Connection
	 
	
	  public static Connection getConnection() throws SQLException{
		  // Step:-2 Get a connection to data base
		  
		  Connection myConn = DriverManager.getConnection("jdbc:mysql://uqouacmcwiib9ke0:X5hht6h63YDn2No7z0H6@bfdd4xaltvgpiroxddcw-mysql.services.clever-cloud.com:3306/bfdd4xaltvgpiroxddcw");
		  
		  return myConn;
	  }

}

