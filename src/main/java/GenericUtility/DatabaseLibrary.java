package GenericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;


public class DatabaseLibrary implements IConstantPath  
{
	public Connection connection;
	public Statement statement;
	
	public void getConnectionFromDataBase() throws SQLException
	{
		Driver dbDriver = new Driver();
		DriverManager.registerDriver(dbDriver);
		connection = DriverManager.getConnection(IConstantPath.dbUrl, IConstantPath.dbUserName, IConstantPath.dbPassword);
	}
	public String readDataFromDatabase(String query, int index, String expectedValue) throws SQLException
	{
		// Getting the Data from the Database
		statement = connection.createStatement();
		ResultSet result = statement.executeQuery(query);
		
		
		// Assert the data
		Boolean flag = false;
		while(result.next())
		{
			if(result.getString(index).equalsIgnoreCase(expectedValue))
			{
				flag=true;
				break;
			}	
		}
		if(flag)
		{
			System.out.println("Data Verified Successfully");
			return expectedValue;
		}
		else
		{
			System.out.println("Data Verification Failed");
			return "";
		}
	}
	public void dissconectFromDatabase() throws SQLException
	{
		connection.close();
	}
}
