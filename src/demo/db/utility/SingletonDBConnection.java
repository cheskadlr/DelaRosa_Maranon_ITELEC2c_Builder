package demo.db.utility;

import java.sql.*;


public class SingletonDBConnection {
	
	//primary requirement of Singleton pattern for implementation
	private static Connection connection;
	
	//primary requirement of Singleton pattern for implementation
	private SingletonDBConnection() {
	}
	
	private static Connection getDBConnection() {
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306" +
				"/itelec", 
				"root", "");
		} catch (ClassNotFoundException cfne) {
			System.err.println(cfne.getMessage());
		} catch (SQLException sqle) {
			System.err.println(sqle.getMessage());
		}
		return connection;
	}
	
	//primary requirement of Singleton pattern for implementation
	public static Connection getConnection() {
		return ( (connection!=null)
				 ?connection
				 : getDBConnection()		 
			);
	}
}
