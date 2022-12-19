package todomvc.todo;

import java.io.IOException;

import todomvc.todo.controller.TodoController;

public class App {

	public static void main(String[] args) throws IOException {

		// 요청에 따른 분기 - Controller 생성(todo/controller/TodoController.java)
		TodoController controller = new TodoController();
		controller.findAll();

		// 할일 순서 번호로 하나의 Todo 조회
//		int todoNumber = 2;
//		controller.findById(todoNumber);

		// 하나의 Todo 등록
		
		// 하나의 Todo 내용 수정
		
		// 하나의 Todo 데이터 삭제
		
		
	}

}