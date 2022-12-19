package todomvc.todo.data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import todomvc.todo.model.Todo;

public class TodoDatabase {
	private static List<Todo> todoDatabase = new ArrayList<>();

	static { // static block, 프로그램 실행 시 한 번만 실행됨 
        todoDatabase.add(new Todo(1, "숙제하기", LocalDate.of(2022, 4, 5), "수학, 영어 숙제"));
        todoDatabase.add(new Todo(2, "조깅하기", LocalDate.of(2022, 5, 7), "공원에서 1시간 동안 조깅을 한다."));
        todoDatabase.add(new Todo(3, "빨래하기", LocalDate.of(2022, 4, 4), "빨래를 모아서 세탁기를 돌린다."));
        todoDatabase.add(new Todo(4, "피아노", LocalDate.of(2022, 4, 7), "학원에서 피아노를 연습한다"));
        todoDatabase.add(new Todo(5, "강아지 밥주기", LocalDate.of(2022, 4, 7), "강아지에게 사료를 준다."));
    }
	
	public static List<Todo> getTododatabase() {
        return todoDatabase;
    }
	
	
}
