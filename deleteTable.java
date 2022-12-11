import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class deleteTable {

public static void main(String []args) throws SQLException  {

	// Select Table Execution using JDBC API
	String selectQuery="delete from cricket;";
	String username="root";
	String url="jdbc:mysql://localhost:3306/ramji";
	String pwd="rR@mji11";

	
	//Loading The Driver
	Driver d=new Driver();
	//Registering The Driver
	DriverManager.registerDriver(d);
	//Establishing The Connection
    Connection c=    DriverManager.getConnection(url, username, pwd);
	//Talking To DataBase  Executing The PreDefined Query     
    PreparedStatement pp =   c.prepareStatement(selectQuery);

   int row= pp.executeUpdate();
    
// Formating The Output Getting from the Database
    
   
    System.out.println("rows affected"+row);
	
}

}
