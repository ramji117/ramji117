import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class updateTable {

public static void main(String []args) throws SQLException  {

	// Update Table Execution using JDBC API
	String updateQuery="update cricket set dob=? where name=?;";
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
    PreparedStatement pp =   c.prepareStatement(updateQuery);
	
    //Setting The Values
    pp.setString(1, "1973-04-24");
    pp.setString(2, "sachin");
    
    int rows = pp.executeUpdate();
    
    System.out.println("rows affected: "+rows);
	
}

}
