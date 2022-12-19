package todomvc.todo.data;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;

import todomvc.todo.model.Todo;

public class TodoTSVWriter {
	// 새로운 Todo를 외부 파일(todo-data-simple.txt)에 추가하는 메서드
	public boolean save(String RESOURCES, Path filePath, Todo todo) {
		boolean result = false;
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(RESOURCES + "todo-data-simple.txt", true);
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
			BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

			long numberOfRows = Files.lines(filePath).count();
			int numberOfTodos = (int) numberOfRows;

			numberOfTodos++; // id값 1 증가
			bufferedWriter.newLine(); // 다음 라인으로 이동
			bufferedWriter.write(numberOfTodos + "\t");

			bufferedWriter.write(todo.getTitle() + "\t");
			bufferedWriter.write(todo.getDueDate() + "\t");
			bufferedWriter.write(todo.getDescription());

			// 자원 해제(반납)
			bufferedWriter.close();
			outputStreamWriter.close();
			fileOutputStream.close();
			
			if (numberOfRows < Files.lines(filePath).count()) {
				result = true;
			} else {
				result = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
}
