package ch.gugus.d3_tree;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class D3 {
    public void run(){
        List<Task> tasks = new ArrayList<>();
        boolean run = true;
        System.out.println("WELCOME TO THE TO-DO MANAGER");
        do{
            System.out.println("=====================================");
            if(tasks.isEmpty()){
                System.out.println("No tasks yet.");
            }
            else{
                for (Task task:tasks) {
                    System.out.println("["+tasks.indexOf(task) + "] "
                            + (task.done ? "| DONE | " : "| OPEN | ") +
                            task.name + "  | Deadline: " + task.deadLine.toString());
                }
            }
            System.out.println("=====================================");
            System.out.println("Add new Task[0]");
            System.out.println("Delete Task[1]");
            System.out.println("Finish Task[2]");
            System.out.println("Change Task name[3]");
            System.out.println("Exit[e]");

            Scanner  scan = new Scanner(System.in);
            String input = scan.nextLine();


            switch (input)
            {
                case "0":
                    System.out.println("Type in Task name");
                    String taskName = scan.nextLine();
                    System.out.println("Type in the Task deadline (yyyy-MM-dd-HH-mm)");
                    String sTaskDealine = scan.nextLine();
                    LocalDateTime taskDeadline = LocalDateTime.parse(sTaskDealine, DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm"));
                    try {
                        tasks.add(new Task(taskName, taskDeadline));
                    }catch (DeadLineException dle){
                        System.out.println(dle.getMessage());
                    }
                    break;
                case "1":
                    System.out.println("Type in Task Number");
                    int taskId = Integer.parseInt(scan.nextLine());
                    tasks.remove(taskId);
                    break;
                case "2":
                    System.out.println("Type in Task Number");
                    int taskNum = Integer.parseInt(scan.nextLine());
                    tasks.get(taskNum).completeTask();
                    break;
                case "3":
                    System.out.println("Type in Task Number");
                    int numChangeTask = Integer.parseInt(scan.nextLine());
                    System.out.println("Type in new Name");
                    String newName = scan.nextLine();
                    tasks.get(numChangeTask).setName(newName);
                    break;
                case "e":
                    run = false;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
        while (run);
    }


}
