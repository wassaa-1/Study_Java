package todomvc.todo.view;

import java.time.format.DateTimeFormatter;
import java.util.List;

import todomvc.todo.model.Todo;

/**
 * 연산 처리된 결과를 알아보기 쉽게 포매팅해서 출력해주는 클래스
 *
 */
public class TodoView {
	// 1. 전체 조회 결과 포매팅, 출력
	public void findAll(List<Todo> todos) {
		for (Todo todo : todos) {
            System.out.println(String.format("%d 번째로 해야 할 일은 %s 입니다.", todo.getId(), todo.getTitle()));
            System.out.println(todo.getDueDate().format(DateTimeFormatter.ofPattern("기한은 yyyy년 MM월 dd일 까지입니다.")));
            System.out.println();
        }
	}

	// 2. 하나의 Todo 조회 결과 출력
    public void findById(Todo todo) {
        System.out.println(todo.getId() + "번째로 할 일은 " + todo.getTitle() + "입니다.");
    }
    
 // 3. 등록 처리 여부 결과 출력
    public void save() {
        System.out.println("정상 등록 되었습니다.");
    }

    // 4. 에러 결과 출력
    public void errorPage() {
        System.out.println("문제가 발생하였습니다.");
    }
}
