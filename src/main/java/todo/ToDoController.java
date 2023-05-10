package todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

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
        List<Todo> todos = ToDoService.findByUsername("kardelenkeles");
        model.addAttribute("todos", todos);
        return "listTodos";
    }
    @RequestMapping(value = "add-todo", method = RequestMethod.GET)
    public String showTodoPage(ModelMap model){
        String username = (String) model.get("name");
        Todo todo = new Todo(0, username, "",
                LocalDate.now().plusYears(1),false);
        model.put("todo",todo);
        return "todo";
    }
    @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    public String addNewTodo(ModelMap model, @Valid Todo todo, BindingResult result){
        if(result.hasErrors()){
            return "todo";
        }
        String username = (String) model.get("name");
        toDoService.addTodo(username, todo.getDesc(),
                LocalDate.now().plusYears(1),false);
        return "redirect:list-todos";
    }
    @RequestMapping("delete-todo")
    public String deleteTodo(@RequestParam int id){
        toDoService.deleteById(id);
        return "redirect:list-todos";
    }
    @RequestMapping(value = "update-todo", method = RequestMethod.GET)
    public String showUpdateTodo(@RequestParam int id, ModelMap model){
        Todo todo = toDoService.findById(id);
        model.addAttribute("todo",todo);
        return "todo";
    }
    @RequestMapping(value = "update-todo", method = RequestMethod.POST)
    public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result){
        if(result.hasErrors()){
            return "todo";
        }
        String username = (String) model.get("name");
        todo.setUsername(username);
        toDoService.updateTodo(todo);
        return "redirect:list-todos";
    }
}
