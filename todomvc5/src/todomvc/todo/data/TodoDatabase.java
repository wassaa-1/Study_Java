package todomvc.todo.data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import todomvc.todo.model.Todo;

public class TodoDatabase {
	private static List<Todo> todoDatabase = new ArrayList<>();

	static { // static block, ���α׷� ���� �� �� ���� ����� 
        todoDatabase.add(new Todo(1, "�����ϱ�", LocalDate.of(2022, 4, 5), "����, ���� ����"));
        todoDatabase.add(new Todo(2, "�����ϱ�", LocalDate.of(2022, 5, 7), "�������� 1�ð� ���� ������ �Ѵ�."));
        todoDatabase.add(new Todo(3, "�����ϱ�", LocalDate.of(2022, 4, 4), "������ ��Ƽ� ��Ź�⸦ ������."));
        todoDatabase.add(new Todo(4, "�ǾƳ�", LocalDate.of(2022, 4, 7), "�п����� �ǾƳ븦 �����Ѵ�"));
        todoDatabase.add(new Todo(5, "������ ���ֱ�", LocalDate.of(2022, 4, 7), "���������� ��Ḧ �ش�."));
    }
	
	public static List<Todo> getTododatabase() {
        return todoDatabase;
    }
	
	// id�� 2���� todo ������ ��ȸ
	// SELECT * FROM todo WHERE id = 2;
	public Todo findById(int todoNumber) {
		// DB�󿡼� id�� ���ϴ� ó���� Java �ڵ�� ǥ��
		for (Todo todo: todoDatabase) {
			if (todo.getId() == todoNumber) {
				return todo;
			}
		}
		return null;
	}

	public boolean save(Todo newTodo) {
		int nextId = todoDatabase.size() + 1;
		newTodo.setId(nextId);
		
		return todoDatabase.add(newTodo);
	}
	
	public Todo updateById(int todoNumber, Todo newTodo) {
		for(Todo todo: todoDatabase) {
			if (todo.getId() == todoNumber) {
				return todoDatabase.set(todoNumber, newTodo);
			}
		}
		return null;
	}
	
	public Todo deleteById(int id) {
		for (Todo todo: todoDatabase) {
			if(todo.getId()==id) return todoDatabase.remove(id);
		}
		return null;
	}
	
}
