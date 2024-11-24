/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author deede
 */
import javax.swing.JOptionPane;
public class Task {
 


    private String taskName;
    private String taskDescription;
    private String developerDetails;
    private int taskDuration;
    private String taskID;
    private String taskStatus;
    private static int taskCounter = 0; // To generate unique task numbers

    public Task(int taskDuration, String taskName, String taskDescription, String developerDetails) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
        this.taskID = createTaskID();
        
        // Show task details when created
        showTaskDetails();
    }

    public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;
    }

    public String createTaskID() {
        taskCounter++;
        return String.format("AD:%d:BYN", taskCounter);
    }

    public String printTaskDetails() {
        return "Task Status: " + taskStatus + "\n" +
               "Developer Details: " + developerDetails + "\n" +
               "Task Number: " + taskCounter + "\n" +
               "Task Name: " + taskName + "\n" +
               "Task Description: " + taskDescription + "\n" +
               "Task ID: " + taskID + "\n" +
               "Duration: " + taskDuration + " hours";
    }

    public int returnTotalHours() {
        return taskDuration;
    }

    public void showTaskDetails() {
        JOptionPane.showMessageDialog(null, printTaskDetails());
    }

    public static void main(String[] args) {
        Task[] tasks = new Task[2];

        // Creating Task 1
        tasks[0] = new Task(8, "Login feature", 
                            "Create login to authenticate users", 
                            "Robyn Harrison");

        // Creating Task 2
        tasks[1] = new Task(10, "Add Task Feature", 
                            "Create Add Task Feature to add task users", 
                            "Mike Smith");

        // Accumulate total hours
        int totalHours = 0;
        for (Task task : tasks) {
            totalHours += task.returnTotalHours();
        }

        // Display total hours
        JOptionPane.showMessageDialog(null, "Total Hours: " + totalHours);
    }
}
   

