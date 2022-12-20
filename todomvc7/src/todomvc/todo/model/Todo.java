package todomvc.todo.model;

import java.time.LocalDate;

public class Todo {
	private int id;
	private String title;
	private LocalDate dueDate;
	private String description;

	
	
	public Todo() {
		super();
	}

	public Todo(int id, String title, LocalDate dueDate, String description) {
		super();
		this.id = id;
		this.title = title;
		this.dueDate = dueDate;
		this.description = description;
	}

	public Todo(String title, LocalDate dueDate, String description) {
		this.title = title;
		this.dueDate = dueDate;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", dueDate=" + dueDate + ", description=" + description + "]";
	}

}
