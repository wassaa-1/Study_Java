package todomvc.todo;

import java.io.IOException;
import java.time.LocalDate;

import todomvc.todo.controller.TodoController;
import todomvc.todo.model.Todo;

public class App {

	public static void main(String[] args) throws IOException {

		// 요청에 따른 분기 - Controller 생성(todo/controller/TodoController.java)
		TodoController controller = new TodoController();
		controller.findAll();

		// 할일 순서 번호로 하나의 Todo 조회
		int todoNumber = 2;
		controller.findById(todoNumber);

		// 하나의 Todo 등록
		Todo newTodo = new Todo("밥 먹기", LocalDate.of(2022, 12, 20), "밥을 먹는다");
		controller.save(newTodo);

		// 등록 결과 확인
		controller.findAll();
	
		// 하나의 Todo 내용 수정
		// id에 해당하는 위치에 다른 Todo로 교체 방식
		int updateNumber = 7;
		Todo updateTodo = new Todo("물 마시기", LocalDate.of(2022, 12, 25), "물을 마신다.");
		controller.updateById(updateNumber, updateTodo);
		
		// 하나의 Todo 데이터 삭제
		int deleteNumber = 8;
		controller.deleteById(deleteNumber);
	}

}