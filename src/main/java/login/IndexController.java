package login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class IndexController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String goToIndex(ModelMap model){
        model.put("name","kardelenkeles");
        return "index";
    }


}
