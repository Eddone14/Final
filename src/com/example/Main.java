package com.example;
import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Create a task
        String title = "Complete assignment";
        String description = "Finish coding the task manager program";
        Date dueDate = new Date();
        int priority = 1;
        taskManager.createTask(title, description, dueDate, priority);

        // Display tasks
        List<Task> tasks = taskManager.displayTasks();
        for (Task task : tasks) {
            System.out.println(task.getTitle() + " - " + task.getDescription() + " - " + task.getDueDate() + " - " + task.getPriority() + " - " + task.isCompleted());
        }

        // Mark task as completed
        Task task = tasks.get(0);
        taskManager.markTaskAsCompleted(task);
        System.out.println("Task marked as completed: " + task.getTitle() + " - " + task.getDescription() + " - " + task.getDueDate() + " - " + task.getPriority() + " - " + task.isCompleted());
    }
}
