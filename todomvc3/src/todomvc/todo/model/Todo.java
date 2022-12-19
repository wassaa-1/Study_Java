package todomvc.todo.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class Todo {
	private int id;
	private String title;
	private LocalDate dueDate;
	private String description;
}
