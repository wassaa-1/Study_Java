package todomvc.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import todomvc.todo.data.TodoTSVParser;
import todomvc.todo.model.Todo;

public class App {
	// 상수는 절대 하드코딩 하지 않는다.
	private static final String RESOURCES = "src/resources/";


	public static void main(String[] args) throws IOException {
		Path filePath = Paths.get(RESOURCES + "todo-data-simple.txt");
		long numberOfLines = Files.lines(filePath).count();
		int rows = (int)numberOfLines;
		
		List<String> lines = Files.readAllLines(filePath);
		
		TodoTSVParser todoTSVParser = new TodoTSVParser();
		Todo[] todos = todoTSVParser.parseLinesFromTSV(lines, rows);
		
		// 전체 Todos 조회
		findAll(todos);
		
		// 할일 순서 번호로 하나의 Todo 조회
		int todoNumber = 2;
		findById(todos, todoNumber);
	}
	

	public static void findAll(Todo[] todos) {
		System.out.println(Arrays.toString(todos));
	}
	
	public static Todo findById(Todo[] todos, int todoNumber) {
		for (Todo todo : todos) {
			if (todo.getId() == todoNumber) return todo;
		}
		return null;
	}

}
