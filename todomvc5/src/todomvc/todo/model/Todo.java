package todomvc.todo.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Todo {
	private int id;
	private String title;
	private LocalDate dueDate;
	private String description;
	public Todo(int id, String title, LocalDate dueDate, String description) {
		super();
		this.id = id;
		this.title = title;
		this.dueDate = dueDate;
		this.description = description;
	}
	public Todo(String title, LocalDate dueDate, String description) {
		super();
		this.title = title;
		this.dueDate = dueDate;
		this.description = description;
	}
	
	
}
