package todomvc.todo.controller;

import java.nio.file.Path;
import java.sql.SQLException;
import java.util.List;

import todomvc.todo.model.Todo;
import todomvc.todo.model.TodoService;
import todomvc.todo.view.TodoView;

/**
 * Controller�� ��û�� ���� � �׼��� ó������ '�б�'�� ���ִ� ���� ����
 *
 */
public class TodoController {
	private final TodoService service = new TodoService();
	private final TodoView view = new TodoView();
	private List<Todo> todos;
	
	public TodoController() {
		super();
	}

	public TodoController(List<Todo> todos) {
		super(); 
		this.todos = todos;
	}

	/**
	 * 1. ��ȸ ���: ��ü Todos ��ȸ �޼���
	 */
	public void findAll() {
		// 1. ��ü Todos ��ȸ�� ó���� ������ �ִ� �κ����� �б�(����) - ����ó�� �����: TodoService.java
		List<Todo> todoList = service.findAll();
		
		// ���޹��� ��ü Todos ������ ����� ����ϵ��� View���� �б�(����) - ��� �����: TodoView.java
		view.findAll(todoList);
	}

	public void findById(int todoNumber) {
		Todo todo = service.findById(todoNumber);
		
		view.findById(todo);
	}

	public void save(Todo newTodo) {
		try {
			int result = service.save(newTodo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateById(int todoNumber, Todo updateTodo) {
		int result = service.updateById(todoNumber, updateTodo);
	}

	public void deleteById(int todoNumber) {
		int result = service.deleteById(todoNumber);
		
	}

}

























