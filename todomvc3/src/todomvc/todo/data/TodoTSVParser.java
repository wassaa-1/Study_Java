package todomvc.todo.data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import todomvc.todo.model.Todo;

public class TodoTSVParser {
	private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	// 한줄만 파싱하는 메서드, 이 클래스 내에서만 사용되기 때문에 private, 외부에 공개할 필요가 없음
	private Todo parseFromTSV(final String line) {
		final String[] columns = line.split("\t");

		final int id = Integer.parseInt(columns[0]); // TODO: int(columnes[0]) ?
		final String title = columns[1];
		final LocalDate dueDate = LocalDate.parse(columns[2], DATE_PATTERN);
		final String description = columns[3];
		
		return new Todo(id, title, dueDate, description);
	}
	
	// 파싱된 행을 배열에 추가하는 메서드
	public Todo[] parseLinesFromTSV(List<String> lines, int rows) {
		Todo[] todos = new Todo[rows];
		
		int index = 0;
		for (String line : lines) { 
			todos[index] = parseFromTSV(line);
			index++;
		}
		
		return todos;
	}
	

}






