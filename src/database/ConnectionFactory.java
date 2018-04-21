package database;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionFactory {

	public Connection getConnection() throws ClassNotFoundException {
    
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			return DriverManager.getConnection(
					"jdbc:mysql://localhost/projeto",
					"root",
					""
					);
		
		} catch(SQLException e) {
			
			throw new RuntimeException(e);
		}
	}
}
