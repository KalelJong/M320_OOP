package ch.gugus.d3_tree;

import java.time.LocalDateTime;

public class Task {
    public String name;
    public boolean done;
    public LocalDateTime deadLine;

    public Task(String name, LocalDateTime deadLine) throws DeadLineException {
        this.name = name;
        this.done = false;
        LocalDateTime today = LocalDateTime.now();
        if (deadLine.isBefore(today)){
            throw new DeadLineException("The deadline has already passed");
        }else{
            this.deadLine = deadLine;

        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeadLine(LocalDateTime deadLine) {
        this.deadLine = deadLine;
    }

    public void completeTask(){
        this.done = true;
    }
}
