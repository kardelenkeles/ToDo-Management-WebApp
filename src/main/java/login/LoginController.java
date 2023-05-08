package login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
    private AuthenticationService authenticationService;
    public LoginController(AuthenticationService authenticationService) {
        super();
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String goIndex(){
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String goLoginPage(@RequestParam String username,
                              @RequestParam String password, ModelMap model){

        if (authenticationService.authenticate(username, password)){
            model.put("username", username);
            return "index";
        }
        model.put("errorMessage", "invalid Credentials! Please try again.");
        return "login";
    }

}
