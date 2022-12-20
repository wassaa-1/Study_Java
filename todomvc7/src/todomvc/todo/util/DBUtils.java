package todomvc.todo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/";
	private static final String DATABASE_NAME = "testdb";
	private static final String USER = "root";
	private static final String PASSWORD = "1111";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DB_URL + DATABASE_NAME, USER, PASSWORD);
	}
	
	public static void dropAndCreateTable() throws SQLException {
		Connection con = getConnection();
		Statement stmt = con.createStatement();
		final String dropTableQuery = "DROP TABLE IF EXISTS todo";
		
		boolean result = stmt.execute(dropTableQuery);  // false
		
		final String createTableQuery = 
	            "CREATE TABLE todo (" +
	            "id INT(5) unsigned NOT NULL AUTO_INCREMENT," +
	            "title VARCHAR(255)," +
	            "description VARCHAR(255)," +
	            "due_date DATE," +
	            "PRIMARY KEY (id))";
	
		boolean result2 = stmt.execute(createTableQuery);
		System.out.println("Table has created");
	}
}
