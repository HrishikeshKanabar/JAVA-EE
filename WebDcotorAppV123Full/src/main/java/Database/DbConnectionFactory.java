package Database;
// Step:1 import java sql
import java.sql.*;

public class DbConnectionFactory {
	
	  // Description : This method gives us or return us connection object
      // return type: Connection
	 
	
	  public static Connection getConnection() throws SQLException{
		  // Step:-2 Get a connection to data base
		  
		  Connection myConn = DriverManager.getConnection("");
		  
		  return myConn;
	  }

}

