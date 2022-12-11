// Create Table Execution using JDBC API

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class tableCreate {

public static void main(String []args) throws SQLException  {

	
	String createQuery="create table cricket(name VARCHAR(20),dob Date,age INT);";
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
    PreparedStatement pp =   c.prepareStatement(createQuery);
	         
    int rows = pp.executeUpdate();
    
    System.out.println("rows affected: "+rows);
	
}

}
