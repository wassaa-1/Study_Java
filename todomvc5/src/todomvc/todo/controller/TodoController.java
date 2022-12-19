package todomvc.todo.controller;

import java.nio.file.Path;
import java.util.List;

import todomvc.todo.data.TodoTSVWriter;
import todomvc.todo.model.Todo;
import todomvc.todo.model.TodoService;
import todomvc.todo.view.TodoView;

public class TodoController {
	private final TodoService service  = new TodoService();
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
	 * 1. 조회 기능: 전체 Todos 조회 메소드
	 */
	public void findAll() {
		// 전체 Todos 조회를 처리할 logic이 있는 부분으로 분기 - TodoService.java
		List<Todo> todoList = service.findAll();
		
		// 전달받은 전체 Todos 데이터 결과를 출력하도록 view에게 분기 전달 - TodoView.java
		view.findAll(todoList);
	}
	
	/**
	 * 2. 추가 기능
	 */
	public void save(String RESOURCES, Path filePath, Todo newTodo) {
		boolean result = service.save(RESOURCES, filePath, newTodo);
		if(result) {
			view.save();
		}else {
			view.errorPage();
		}
	}
	
	/**
	 * 3. 아이디로 조회
	 */
	public void findById(int todoNumber) {
		Todo todo = service.findById(todos, todoNumber);
		
		view.findById(todo);
	}
}