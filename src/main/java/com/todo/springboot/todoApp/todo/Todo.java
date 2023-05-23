package com.todo.springboot.todoApp.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Table(name = "T_TODO")
@Entity(name = "todo")
public class Todo {
    public Todo(int id, String username, String desc, LocalDate targetDate, boolean done) {
        super();
        this.id = id;
        this.username = username;
        this.desc = desc;
        this.targetDate = targetDate;
        this.done = done;
    }

    @Id
    @GeneratedValue
    private int id;
    private String username;
    @Size(min = 10, message = "Enter at least 10 characters")
    private String desc;
    private LocalDate targetDate;
    private boolean done;

    public Todo() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "ToDoPage{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", desc='" + desc + '\'' +
                ", targetDate=" + targetDate +
                ", done=" + done +
                '}';
    }
}
