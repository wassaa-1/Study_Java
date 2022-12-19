package todomvc.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import todomvc.todo.model.Todo;

public class App {
	// 상수는 절대 하드코딩 하지 않는다.
	private static final String RESOURCES = "src/resources/";
	private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	public static void main(String[] args) throws IOException {
		Path filePath = Paths.get(RESOURCES + "todo-data-simple.txt");
		long numberOfLines = Files.lines(filePath).count();
		int rows = (int)numberOfLines;
		
		List<String> lines = Files.readAllLines(filePath);
		
		Todo[] todos = new Todo[rows];
		
		int index = 0;
		for (String line: lines) {
			final String[] columns = line.split("\t");
			
			final int id = Integer.parseInt(columns[0]); // TODO: int(columnes[0]) ?
			final String title = columns[1];
			final LocalDate dueDate = LocalDate.parse(columns[2], DATE_PATTERN);
			final String description = columns[3];
			
			todos[index] = new Todo(id, title, dueDate, description);
			index++;
			
		}
		
		// 전체 Todos 조회
		System.out.println(Arrays.toString(todos));
		
		// 할일 순서 번호로 하나의 Todo 조회
		int todoNumber = 2;
		for (Todo todo : todos) {
			if (todo.getId() == todoNumber) System.out.println(todo);
		}
	}

}
