package todomvc.todo.model;

import java.util.List;

import todomvc.todo.dao.TodoDAO;

/**
 * 로직, 연산처리 담당 클래스
 *
 */
public class TodoService {
	private final TodoDAO todoDAO;
	
	
	public TodoService() {
		todoDAO = new TodoDAO();
	}

	/**
	 * 1. 조회 기능: 전체 Todos 조회 메서드
	 */
	public List<Todo> findAll() {
		// 전체 데이터 조회는 별도의 로직 x, 조회만 하면 됨(DB 데이터가 변하지 않음, 멱등성idempotent)
		return todoDAO.findAll();
	}

	public Todo findById(int todoNumber) {
		// DB 접근 코드 ....
		Todo todo = todoDAO.findById(todoNumber);
		return todo;
	}

	public boolean save(Todo newTodo) {
		return todoDAO.save(newTodo);
	}

}
