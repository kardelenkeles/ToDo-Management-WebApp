package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
    /*@RequestMapping("say-html")
    @ResponseBody
    public String sayHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>ToDoApp</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("To do list");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    } */
    @RequestMapping("jsp")
    public String jsp(){
        return "hellojsp";
    }

}
