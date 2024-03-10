package com.muchiri.jdbcdemo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("task")
public class Task {
    @Id
    private Integer taskId;
    private String text;
    private Integer personId;

    public Task() {
    }

    public Task(Integer taskId, String text, Integer personId) {
        this.taskId = taskId;
        this.text = text;
        this.personId = personId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", text='" + text + '\'' +
                ", personId=" + personId +
                '}';
    }
}
