package todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {
    private static List<ToDoPage> todos = new ArrayList<>();
    private static int todosCount = 0;
    static {
        todos.add(new ToDoPage(++todosCount, "kardelenkeles", "Istanbul",
                LocalDate.now().plusYears(1), false));
        todos.add(new ToDoPage(++todosCount, "kardelenkeles", "Istanbul",
                LocalDate.now().plusYears(2), false));
    }

    public static List<ToDoPage> findByUsername(String username) {
        return todos;
    }
    public void addTodo(String username, String desc, LocalDate targetDate, boolean done){
        ToDoPage todo= new ToDoPage(++todosCount, username, desc, targetDate, done);
        todos.add(todo);
    }
}
