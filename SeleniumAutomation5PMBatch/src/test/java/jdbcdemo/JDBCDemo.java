package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo 
{

	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "db";
		String dburl = url+dbName;
		String userName = "root";
		String password = "root";
		
		//create an object for driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//connect to mysql database system
		Connection connection = DriverManager.getConnection(dburl, userName, "");
		
		//Executing the sql queries on the command db database
		if(!connection.isClosed())
		{
			System.out.println("successfully connected to DB database");
			
			//Execute the query to retrive the employee table records
			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery("select * from employee");
			
			while (resultset.next())
			{
				System.out.println(resultset.getString("Name")+" --- "+ resultset.getString("location")+" --- "+ resultset.getInt("expirence"));
			}
		}
	}

}
