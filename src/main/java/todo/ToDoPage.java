package todo;

import java.time.LocalDate;

public class ToDoPage {
    private int id;
    private String username;
    private String desc;
    private LocalDate targetDate;
    private boolean done;

    public ToDoPage(int id, String username, String desc, LocalDate targetDate, boolean done) {
        super();
        this.id = id;
        this.username = username;
        this.desc = desc;
        this.targetDate = targetDate;
        this.done = done;
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
