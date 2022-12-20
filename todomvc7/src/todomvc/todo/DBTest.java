package todomvc.todo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import todomvc.todo.util.DBUtils;

public class DBTest {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/";
	private static final String DATABASE_NAME = "testdb";
	private static final String USER = "root";
	private static final String PASSWORD = "1111";
//	private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		/**
		 * Java - DB ���� �׽�Ʈ �ڵ�
		 * 
		 * DB ������ �����ϱ� ���� �ʿ��� �׸�
		 * 1. DB�� url
		 * 2. DB �̸� - DBMS�� ������ ���ϴ� ���� �ƴϰ�, Schema �̸�(Schema�� Database��� �θ�)
		 * 3. User �̸�
		 * 4. User�� Password
		 */
		
		// JDBC 4.0 ���ķ� ��� ����̹����� Ŭ���� �н��� �ڵ����� �ε��̵�
//		Class.forName(DRIVER_NAME); // JDBC 4.0 ������ �ۼ��ؾ� �ߴ� �ڵ�(Driver �ε�)
		
		Connection connection = DriverManager.getConnection(DB_URL + DATABASE_NAME, USER, PASSWORD);
		System.out.println(connection);
		// No suitable driver found for jdbc:mysql://localhost:3306/
		
		DBUtils.dropAndCreateTable();
				
	}
	

}
