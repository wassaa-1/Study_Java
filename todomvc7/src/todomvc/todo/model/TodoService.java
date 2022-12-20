package todomvc.todo.model;

import java.sql.SQLException;
import java.util.List;

import todomvc.todo.dao.TodoDAO;

/**
 * ����, ����ó�� ��� Ŭ����
 *
 */
public class TodoService {
	private final TodoDAO todoDAO;
	
	
	public TodoService() {
		todoDAO = new TodoDAO();
	}

	/**
	 * 1. ��ȸ ���: ��ü Todos ��ȸ �޼���
	 */
	public List<Todo> findAll() {
		// ��ü ������ ��ȸ�� ������ ���� x, ��ȸ�� �ϸ� ��(DB �����Ͱ� ������ ����, ��idempotent)
		return todoDAO.findAll();
	}

	public Todo findById(int todoNumber) {
		// DB ���� �ڵ� ....
		Todo todo = todoDAO.findById(todoNumber);
		return todo;
	}

	public int save(Todo newTodo) throws SQLException {
		return todoDAO.save(newTodo);
	}

	public int updateById(int todoNumber, Todo updateTodo) {
		return todoDAO.updateById(todoNumber, updateTodo);
	}

	public int deleteById(int todoNumber) {
		return todoDAO.deleteById(todoNumber);
	}

}
