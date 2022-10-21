package duke.entity;

import duke.constant.Constant;

public class Todo extends Task {

    public Todo(String description) {
        super(description);
        setType(Constant.Task.TYPE_TODO);
    }
}