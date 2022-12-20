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
		 * Java - DB 연결 테스트 코드
		 * 
		 * DB 서버와 연결하기 위해 필요한 항목
		 * 1. DB의 url
		 * 2. DB 이름 - DBMS의 벤더를 말하는 것이 아니고, Schema 이름(Schema를 Database라고도 부름)
		 * 3. User 이름
		 * 4. User의 Password
		 */
		
		// JDBC 4.0 이후로 모든 드라이버들은 클래스 패스에 자동으로 로딩이됨
//		Class.forName(DRIVER_NAME); // JDBC 4.0 이전에 작성해야 했던 코드(Driver 로딩)
		
		Connection connection = DriverManager.getConnection(DB_URL + DATABASE_NAME, USER, PASSWORD);
		System.out.println(connection);
		// No suitable driver found for jdbc:mysql://localhost:3306/
		
		DBUtils.dropAndCreateTable();
				
	}
	

}
