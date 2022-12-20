package todomvc.todo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import todomvc.todo.model.Todo;
import todomvc.todo.util.DBUtils;

/**
 * Data Access Object - 데이터(DB)에 접근하는 클래스(Object, 객체)
 */
public class TodoDAO {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/";
	private static final String DATABASE_NAME = "testdb";
	private static final String USER = "root";
	private static final String PASSWORD = "1111";
	
	// Java 7 이전 방식
	private Connection con; // con
	private Statement stmt; // pandas as pd와 같은 맥락
	private ResultSet rs; // rset
	private PreparedStatement pstmt;
	
	// Java 7 이전 방식
 	public List<Todo> findAll() {
		final String selectQuery = "SELECT * FROM todo";
		List<Todo> todos = new ArrayList<>();
		
		try {
			// Java Application과 DB와의 커넥션 연결
			con = DBUtils.getConnection();
			// DB로의 Query를 전달해주는 객체 생성(Factory Method pattern)
			stmt = con.createStatement();
			// Query 전달 및 수행
			rs = stmt.executeQuery(selectQuery);
			
			while (rs.next()) {
				// id, title, new Todo 같은 Java Code 및 Java의 객체(Object) - rs.getInt, getString과 같은 DB에서 가져온 코드(Relation, 테이블)
				// Object(객체)와 Relation(테이블)을 연결(Mapping) Object-Relation Mapping(ORM)
				final int id = rs.getInt("id");
				final String title = rs.getString("title");
				// Type mismatch: cannot convert from Date to LocalDate
				final LocalDate dueDate = rs.getDate("due_date").toLocalDate(); // Date보다는 LocalDate 사용 권장
				final String description = rs.getString("description");
				
				todos.add(new Todo(id, title, dueDate, description));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 자원 해제
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return todos;
	}
	
	// Java 7 이전 방식(자원 해제)
	public Todo findById(int todoNumber) {
		final String selectQuery = "SELECT * FROM todo WHERE id = ?";
		
		try {
			con = DriverManager.getConnection(DB_URL + DATABASE_NAME, USER, PASSWORD);
			pstmt = con.prepareStatement(selectQuery);
			pstmt.setInt(1, todoNumber); // 1번째 물음표에는 todoNumber를 맵핑
			
			rs = pstmt.executeQuery();
			if (rs.next()) {
				// id, title, new Todo 같은 Java Code 및 Java의 객체(Object) - rs.getInt, getString과 같은 DB에서 가져온 코드(Relation, 테이블)
				// Object(객체)와 Relation(테이블)을 연결(Mapping) Object-Relation Mapping(ORM)
				final int id = rs.getInt("id");
				final String title = rs.getString("title");
				// Type mismatch: cannot convert from Date to LocalDate
				final LocalDate dueDate = rs.getDate("due_date").toLocalDate(); // Date보다는 LocalDate 사용 권장
				final String description = rs.getString("description");
				
				return new Todo(id, title, dueDate, description);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// 자원 해제
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
		
	}

	// Java 7 이후 방식(자원 해제)
	// try-with-resources - try() 내부에 자원 반납이 필요한 객체들을 선언 및 코드 작성하면, close()를 호출하지 않아도 자동으로 자원이 해제됨
	public int save(Todo newTodo) throws SQLException {
		String insertQuery = "INSERT INTO TODO (title, description, due_date) VALUES (?, ?, ?)";
		int affectedRows = 0;
		
		try(Connection con = DBUtils.getConnection();
			PreparedStatement pstmt = con.prepareStatement(insertQuery);
			) {
			pstmt.setString(1, newTodo.getTitle()); // 1번째 물음표에는 todoNumber를 맵핑
			pstmt.setString(2, newTodo.getDescription());
			pstmt.setString(3, newTodo.getDueDate().toString());
			affectedRows = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return affectedRows;
	}

	public int updateById(int todoNumber, Todo updateTodo) {
		String updateQuery = "UPDATE todo SET title=?, due_date=?, description=? WHERE id=?";
		int affectedRows = 0;
		try(Connection con = DBUtils.getConnection();
			PreparedStatement pstmt = con.prepareStatement(updateQuery);
			) {
			pstmt.setString(1, updateTodo.getTitle());
			pstmt.setString(2, updateTodo.getDueDate().toString());
			pstmt.setString(3, updateTodo.getDescription());
			pstmt.setInt(4, todoNumber);
			affectedRows = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return affectedRows;
	}

	public int deleteById(int todoNumber) {
		String deleteQuery = "DELETE FROM todo WHERE id=?";
		int affectedRows = 0;
		try(Connection con = DBUtils.getConnection();
			PreparedStatement pstmt = con.prepareStatement(deleteQuery);
			) {
			pstmt.setInt(1, todoNumber);
			affectedRows = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return affectedRows;
	}
	
}
