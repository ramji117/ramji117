import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class selectTable {

public static void main(String []args) throws SQLException  {

	// Select Table Execution using JDBC API
	String selectQuery="select * from cricket;";
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
	 
    ResultSet r=pp.executeQuery();
    
// Formating The Output Getting from the Database
    
    while(r.next())
    {
    	String  name=r.getString(1);
    	String dob = r.getString(2);
    	 int age=r.getInt(3);
    	 
    	 System.out.println(name+" "+dob+" "+age);
    }
    
	
}

}