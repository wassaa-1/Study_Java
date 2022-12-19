package todomvc.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import todomvc.todo.data.TodoTSVParser;
import todomvc.todo.data.TodoTSVWriter;
import todomvc.todo.model.Todo;

public class App {
	// 상수는 절대 하드코딩 하지 않는다.
	private static final String RESOURCES = "src/resources/";
	

	public static void main(String[] args) throws IOException {
		Path filePath = Paths.get(RESOURCES + "todo-data-simple.txt");
		long numberOfLines = Files.lines(filePath).count();
		int rows = (int)numberOfLines;
		
		List<String> lines = Files.readAllLines(filePath);
		
		// 데이터를 파싱하는 부분을 별도의 클래스 TodoTSVParser.java로 분리
		TodoTSVParser todoTSVParser = new TodoTSVParser();
		List<Todo> todos = todoTSVParser.parseLinesFromTSV(lines, rows);
		
		// 전체 Todos 조회
		findAll(todos);
		
		// 할일 순서 번호로 하나의 Todo 조회
		int todoNumber = 2;
		findById(todos, todoNumber);
		
		// 할일 추가하는 부분을 별도의 클래스 TodoTSVWriter.java로 분리
		TodoTSVWriter todoTSVWriter = new TodoTSVWriter();
		Todo newTodo = new Todo("산책하기", LocalDate.of(2022, 04, 05), "강아지와 산책한다.");
		todoTSVWriter.save(RESOURCES, filePath, newTodo);
	}
	
	// 전체 Todos 조회
	public static void findAll(List<Todo> todos) {
		System.out.println(todos);
	}
	
	public static Todo findById(List<Todo> todos, int todoNumber) {
		for (Todo todo : todos) {
			if (todo.getId() == todoNumber) return todo;
		}
		return null;
	}

}













