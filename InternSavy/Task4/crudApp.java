import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class crudApp {
    public static void main(String[] args) {
        ArrayList<Task> taskList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Task Manager");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String taskName = scanner.nextLine();
                    taskList.add(new Task(taskName));
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    if (taskList.isEmpty()) {
                        System.out.println("No tasks to display.");
                    } else {
                        System.out.println("Tasks:");
                        for (int i = 0; i < taskList.size(); i++) {
                            Task task = taskList.get(i);
                            System.out.println((i + 1) + ". " + task.getName());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter the task number to update: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (updateIndex >= 1 && updateIndex <= taskList.size()) {
                        System.out.print("Enter the new task name: ");
                        String newTaskName = scanner.nextLine();
                        taskList.get(updateIndex - 1).setName(newTaskName);
                        System.out.println("Task updated successfully!");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 4:
                    System.out.print("Enter the task number to delete: ");
                    int deleteIndex = scanner.nextInt();

                    if (deleteIndex >= 1 && deleteIndex <= taskList.size()) {
                        taskList.remove(deleteIndex - 1);
                        System.out.println("Task deleted successfully!");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Task Manager.");
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
