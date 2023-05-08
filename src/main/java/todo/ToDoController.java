package todo;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
public class ToDoController {

    public ToDoController(ToDoService toDoService) {
        super();
        this.toDoService = toDoService;
    }
    private ToDoService toDoService;

    @RequestMapping("list-todos")
    public String listTodos(ModelMap model){
        List<ToDoPage> todos = ToDoService.findByUsername("kardelenkeles");
        model.addAttribute("todos", todos);
        return "listTodos";
    }
    @RequestMapping(value = "add-todo", method = RequestMethod.GET)
    public String showTodoPage(){
        return "todo";
    }
    @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    public String addNewTodo(@RequestParam String desc, ModelMap model){
        String username = (String) model.get("name");
        toDoService.addTodo(username, desc, LocalDate.now().plusYears(1),false);
        return "redirect:list-todos";
    }
}
