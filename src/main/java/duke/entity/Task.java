package duke.entity;

import java.util.Objects;

public class Task {

    protected String description;

    protected boolean done;

    protected String type;

    public Task(String description) {
        this.description = description;
        this.done = false;
    }

    private String getStatusIcon() {
        return (isDone() ? "X" : " ");
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    private String getTypeIcon() {
        return Objects.nonNull(type) ? getType() : " ";
    }

    @Override
    public String toString() {
        return String.format("[%s][%s] %s", getTypeIcon(), getStatusIcon(), getDescription());
    }
}