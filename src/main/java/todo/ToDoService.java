package todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todosCount = 0;
    static {
        todos.add(new Todo(++todosCount, "kardelenkeles", "Istanbul",
                LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, "kardelenkeles", "Istanbul",
                LocalDate.now().plusYears(2), false));
    }

    public static List<Todo> findByUsername(String username) {
        return todos;
    }
    public void addTodo(String username, String desc, LocalDate targetDate, boolean done){
        Todo todo= new Todo(++todosCount, username, desc, targetDate, done);
        todos.add(todo);
    }
}
