package todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {
    private static List<ToDoPage> todos = new ArrayList<>();
    static {
        todos.add(new ToDoPage(1, "keles", "Istanbul",
                LocalDate.now().plusYears(1), false));
        todos.add(new ToDoPage(2, "keles", "Istanbul",
                LocalDate.now().plusYears(2), false));
    }

    public static List<ToDoPage> findByUsername(String username) {
        return todos;
    }
}
