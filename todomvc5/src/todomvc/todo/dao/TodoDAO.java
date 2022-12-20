package todomvc.todo.dao;

import java.util.List;

import todomvc.todo.data.TodoDatabase;
import todomvc.todo.model.Todo;

/**
 * Data Access Object - 데이터(DB)에 접근하는 클래스(Object, 객체)
 * TodoDatabase(DB)에게 접근해서 데이터 조회해오는 역할
 * 
 * TodoDAO.java -> TodoDatabase.java에 접근
 */
public class TodoDAO {
	private final TodoDatabase todoDatabase;
	
	public TodoDAO() {
		todoDatabase = new TodoDatabase();
	}

	public List<Todo> findAll() {
		return TodoDatabase.getTododatabase();
	}

	public Todo findById(int todoNumber) {
		return todoDatabase.findById(todoNumber);
	}

	public boolean save(Todo newTodo) {
		return todoDatabase.save(newTodo);
	}
	
	
}
