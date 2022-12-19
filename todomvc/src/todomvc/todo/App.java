package todomvc.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

public class App {
	// 상수는 절대 하드코딩 하지 않는다.
	private static final String RESOURCES = "src/resources/";
	private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	public static void main(String[] args) throws IOException {
		Path filePath = Paths.get(RESOURCES + "todo-data-simple.txt");
		// Unhandled exception type IOException(Input, Ouput), 입출력 예외에 대한 처리 필요
		long numberOfLines = Files.lines(filePath).count();
		int rows = (int)numberOfLines;
		
		// 할 일 번호들
		int[] todoNumbers = new int[rows];
		
		// 할 일 제목들
		String[] todoTitles = new String[rows];
		
		// 할 일 내용들
		String[] todoDescriptions = new String[rows];
				
		// 할 일 날짜들
		LocalDate[] todoDueDate = new LocalDate[rows];
		
		List<String> lines = Files.readAllLines(filePath);
		
		// 반복문을 활용해서 각 배열들에 각 컬럼의 데이터들을 담기
		int index = 0;
		for (String line: lines) {
			// 각 컬럼 별 데이터들
			final String[] columns = line.split("\t"); // JS에서의 const와 동일한 맥락
			System.out.println(columns);
			
			final int id = Integer.parseInt(columns[0]); // TODO: int(columnes[0]) ?
			final String title = columns[1];
			final LocalDate dueDate = LocalDate.parse(columns[2], DATE_PATTERN);
			final String description = columns[3];
			
			todoNumbers[index] = id;
			todoTitles[index] = title;
			todoDescriptions[index] = description;
			todoDueDate[index] = dueDate;
			index++;
		}
		
		// 전체 Todos 조회
		for (int i = 0; i < rows; i++) {
			System.out.println(todoNumbers[i] + "번 째로 해야 할 일은 : " + todoTitles[i] +"이고, " + "할 일 내용은 : " + todoDescriptions[i] + "이다. " + "기한은 " + todoDueDate[i] + "까지.");
		}
		
	}

}
