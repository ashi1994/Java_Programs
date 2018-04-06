package Jdbc;
import java.sql.*;

class MysqlCon
{  
public static void main(String args[])
{
	try
{  
		Class.forName("com.mysql.jdbc.Driver");//register the driverr class
     //The forName() method of Class class is used to register the driver class. This method is used to dynamically load the driver class.
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");//create connection 
     //here sonoo is database name, root is username and password 
     //The getConnection() method of DriverManager class is used to establish connection with the database.
		
		Statement stmt=con.createStatement();//create statement object
		//The createStatement() method of Connection interface is used to create statement.
		
		ResultSet rs=stmt.executeQuery("select * from emp");//execuye query
        //The executeQuery() method of Statement interface is used to execute queries to the database.
		
		while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
		
		con.close();//close connection object
        //The close() method of Connection interface is used to close the connection.
}
	catch(Exception e)
	{
		System.out.println(e);
		
	}  
}  
}  