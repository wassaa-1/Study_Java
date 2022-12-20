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
 * Data Access Object - ������(DB)�� �����ϴ� Ŭ����(Object, ��ü)
 */
public class TodoDAO {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/";
	private static final String DATABASE_NAME = "testdb";
	private static final String USER = "root";
	private static final String PASSWORD = "1111";
	
	// Java 7 ���� ���
	private Connection con; // con
	private Statement stmt; // pandas as pd�� ���� �ƶ�
	private ResultSet rs; // rset
	private PreparedStatement pstmt;
	
	// Java 7 ���� ���
 	public List<Todo> findAll() {
		final String selectQuery = "SELECT * FROM todo";
		List<Todo> todos = new ArrayList<>();
		
		try {
			// Java Application�� DB���� Ŀ�ؼ� ����
			con = DBUtils.getConnection();
			// DB���� Query�� �������ִ� ��ü ����(Factory Method pattern)
			stmt = con.createStatement();
			// Query ���� �� ����
			rs = stmt.executeQuery(selectQuery);
			
			while (rs.next()) {
				// id, title, new Todo ���� Java Code �� Java�� ��ü(Object) - rs.getInt, getString�� ���� DB���� ������ �ڵ�(Relation, ���̺�)
				// Object(��ü)�� Relation(���̺�)�� ����(Mapping) Object-Relation Mapping(ORM)
				final int id = rs.getInt("id");
				final String title = rs.getString("title");
				// Type mismatch: cannot convert from Date to LocalDate
				final LocalDate dueDate = rs.getDate("due_date").toLocalDate(); // Date���ٴ� LocalDate ��� ����
				final String description = rs.getString("description");
				
				todos.add(new Todo(id, title, dueDate, description));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// �ڿ� ����
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return todos;
	}
	
	// Java 7 ���� ���(�ڿ� ����)
	public Todo findById(int todoNumber) {
		final String selectQuery = "SELECT * FROM todo WHERE id = ?";
		
		try {
			con = DriverManager.getConnection(DB_URL + DATABASE_NAME, USER, PASSWORD);
			pstmt = con.prepareStatement(selectQuery);
			pstmt.setInt(1, todoNumber); // 1��° ����ǥ���� todoNumber�� ����
			
			rs = pstmt.executeQuery();
			if (rs.next()) {
				// id, title, new Todo ���� Java Code �� Java�� ��ü(Object) - rs.getInt, getString�� ���� DB���� ������ �ڵ�(Relation, ���̺�)
				// Object(��ü)�� Relation(���̺�)�� ����(Mapping) Object-Relation Mapping(ORM)
				final int id = rs.getInt("id");
				final String title = rs.getString("title");
				// Type mismatch: cannot convert from Date to LocalDate
				final LocalDate dueDate = rs.getDate("due_date").toLocalDate(); // Date���ٴ� LocalDate ��� ����
				final String description = rs.getString("description");
				
				return new Todo(id, title, dueDate, description);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// �ڿ� ����
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
		
	}

	// Java 7 ���� ���(�ڿ� ����)
	// try-with-resources - try() ���ο� �ڿ� �ݳ��� �ʿ��� ��ü���� ���� �� �ڵ� �ۼ��ϸ�, close()�� ȣ������ �ʾƵ� �ڵ����� �ڿ��� ������
	public int save(Todo newTodo) throws SQLException {
		String insertQuery = "INSERT INTO TODO (title, description, due_date) VALUES (?, ?, ?)";
		int affectedRows = 0;
		
		try(Connection con = DBUtils.getConnection();
			PreparedStatement pstmt = con.prepareStatement(insertQuery);
			) {
			pstmt.setString(1, newTodo.getTitle()); // 1��° ����ǥ���� todoNumber�� ����
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
