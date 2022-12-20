package todomvc.todo;

import java.io.IOException;
import java.time.LocalDate;

import todomvc.todo.controller.TodoController;
import todomvc.todo.model.Todo;

public class App {

	public static void main(String[] args) throws IOException {

		// ��û�� ���� �б� - Controller ����(todo/controller/TodoController.java)
		TodoController controller = new TodoController();
		controller.findAll();

		// ���� ���� ��ȣ�� �ϳ��� Todo ��ȸ
		int todoNumber = 2;
		controller.findById(todoNumber);

		// �ϳ��� Todo ���
		Todo newTodo = new Todo("�� �Ա�", LocalDate.of(2022, 12, 20), "���� �Դ´�");
		controller.save(newTodo);

		// ��� ��� Ȯ��
		controller.findAll();
	
		// �ϳ��� Todo ���� ����
		// id�� �ش��ϴ� ��ġ�� �ٸ� Todo�� ��ü ���
		int updateNumber = 7;
		Todo updateTodo = new Todo("�� ���ñ�", LocalDate.of(2022, 12, 25), "���� ���Ŵ�.");
		controller.updateById(updateNumber, updateTodo);
		
		// �ϳ��� Todo ������ ����
		int deleteNumber = 8;
		controller.deleteById(deleteNumber);
	}

}