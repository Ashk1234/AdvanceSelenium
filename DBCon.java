package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DBCon {

	public static void main(String[] args) throws Exception  {
		//Make a connection to the Database using method.
		String ConnectionUrl="jdbc:sqlserver://localhost:1433;" + "databasesName=System Databases; integratedSecurity=true;";
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		//Load mysql jdbc driver
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		con=DriverManager.getConnection(ConnectionUrl);
		System.out.println("Stablished Connection");
		//Create Query to the Database using the Statement Object.
		String SQL="Select*From Persons";
		stmt=con.createStatement();
		
		//Send the query to database using execute query and store the results in the ResultSet object.
		
		rs=stmt.executeQuery(SQL);
		
		
		while(rs.next())
		{
			
			System.out.println(rs.getString(1)+ " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));
			
		}
	}

}
