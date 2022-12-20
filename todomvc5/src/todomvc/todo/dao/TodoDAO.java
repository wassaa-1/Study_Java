package todomvc.todo.dao;

import java.util.List;

import todomvc.todo.data.TodoDatabase;
import todomvc.todo.model.Todo;

/**
 * Data Access Object - ������(DB)�� �����ϴ� Ŭ����(Object, ��ü)
 * TodoDatabase(DB)���� �����ؼ� ������ ��ȸ�ؿ��� ����
 * 
 * TodoDAO.java -> TodoDatabase.java�� ����
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
