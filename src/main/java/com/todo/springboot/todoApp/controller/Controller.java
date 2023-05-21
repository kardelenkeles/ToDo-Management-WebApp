package com.todo.springboot.todoApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;


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
    @RequestMapping("index")
    public String loginMessage(){
        return "index";
    }

}
