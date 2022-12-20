package todomvc.todo.view;

import java.time.format.DateTimeFormatter;
import java.util.List;

import todomvc.todo.model.Todo;

/**
 * ���� ó���� ����� �˾ƺ��� ���� �������ؼ� ������ִ� Ŭ����
 *
 */
public class TodoView {
	// 1. ��ü ��ȸ ��� ������, ���
	public void findAll(List<Todo> todos) {
		for (Todo todo : todos) {
            System.out.println(String.format("%d ��°�� �ؾ� �� ���� %s �Դϴ�.", todo.getId(), todo.getTitle()));
            System.out.println(todo.getDueDate().format(DateTimeFormatter.ofPattern("������ yyyy�� MM�� dd�� �����Դϴ�.")));
            System.out.println();
        }
	}

	// 2. �ϳ��� Todo ��ȸ ��� ���
    public void findById(Todo todo) {
        System.out.println(todo.getId() + "��°�� �� ���� " + todo.getTitle() + "�Դϴ�.");
    }
    
    // 3. ��� ó�� ���� ��� ���
    public void save() {
        System.out.println("���� ��� �Ǿ����ϴ�.");
    }

    // 4. ���� ��� ���
    public void errorPage() {
        System.out.println("������ �߻��Ͽ����ϴ�.");
    }
    
}
