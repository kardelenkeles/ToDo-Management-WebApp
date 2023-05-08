package todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ToDoController {

    public ToDoController(ToDoService toDoService) {
        super();
        this.toDoService = toDoService;
    }
    private ToDoService toDoService;

    @RequestMapping("list-todos")
    public String listTodos(ModelMap model){
        List<ToDoPage> todos = toDoService.findByUsername("kardelenkeles");
        model.addAttribute("todos", todos);
        return "listTodos";
    }

}
