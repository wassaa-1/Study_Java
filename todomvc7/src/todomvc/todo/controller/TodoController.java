package todomvc.todo.controller;

import java.nio.file.Path;
import java.sql.SQLException;
import java.util.List;

import todomvc.todo.model.Todo;
import todomvc.todo.model.TodoService;
import todomvc.todo.view.TodoView;

/**
 * Controller는 요청에 따라 어떤 액션을 처리할지 '분기'만 해주는 역할 수행
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
	 * 1. 조회 기능: 전체 Todos 조회 메서드
	 */
	public void findAll() {
		// 1. 전체 Todos 조회를 처리할 로직이 있는 부분으로 분기(전달) - 로직처리 담당자: TodoService.java
		List<Todo> todoList = service.findAll();
		
		// 전달받은 전체 Todos 데이터 결과를 출력하도록 View에게 분기(전달) - 출력 담당자: TodoView.java
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

























