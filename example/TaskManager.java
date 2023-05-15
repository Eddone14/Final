package com.example;

import java.util.Date;
import java.util.List;

public class TaskManager {
    private TaskList taskList;

    public TaskManager() {
        this.taskList = new TaskList();
    }

    public void createTask(String title, String description, Date dueDate, int priority) {
        Task task = new Task(title, description, dueDate, priority);
        taskList.addTask(task);
    }

    public List<Task> displayTasks() {
        return taskList.getTasks();
    }

    public void markTaskAsCompleted(Task task) {
        task.setCompleted(true);
    }
}
