package com.belajar.looparray;

import java.util.Scanner;

public class TodoListCli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array untuk menyimpan tasks (maksimal 100 tasks)
        String[] tasks = new String[100];
        boolean[] completed = new boolean[100];
        int taskCount = 0;

        boolean running = true;

        while (running) {
            // Display menu
            System.out.println("\n╔════════════════════════════╗");
            System.out.println("║      TODO LIST MANAGER     ║");
            System.out.println("╚════════════════════════════╝");
            System.out.println("1. Add Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Mark Task as Complete");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose option (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (taskCount >= tasks.length) {
                        System.out.println("❌ Task list is full!");
                        break;
                    }

                    System.out.println("Enter task description: ");
                    String newTask = scanner.nextLine();

                    tasks[taskCount] = newTask;
                    completed[taskCount] = false;
                    taskCount++;

                    System.out.println("✅ Task added successfully!");
                    break;

                case 2:
                    if (taskCount == 0) {
                        System.out.println("No tasks available.");
                        break;
                    }

                    System.out.println("\n════════ YOUR TASKS ════════");
                    for (int i = 0; i < taskCount; i++) {
                        String status = completed[i] ? "✔️" : "";
                        String taskDisplay = completed[i] ? "~~" + tasks[i] + "~~" : tasks[i];
                        System.out.printf("%d. %s %s\n", (i + 1), status, taskDisplay);
                    }
                    System.out.println("════════════════════════════");

                    // Summary
                    int completedCount = 0;
                    for (int i = 0; i < taskCount; i++) {
                        if (completed[i])
                            completedCount++;
                    }
                    System.out.printf("Total: %d | Completed: %d | Pending: %d\n", taskCount, completedCount,
                            taskCount - completedCount);
                    break;

                case 3:
                    if (taskCount == 0) {
                        System.out.println("No tasks to mark!");
                        break;
                    }

                    // Show tasks first
                    System.out.println("\n════════ TASKS ════════");
                    for (int i = 0; i < taskCount; i++) {
                        if (!completed[i]) {
                            System.out.printf("%d. %s\n", (i + 1), tasks[i]);
                        }
                    }

                    System.out.println("Enter task number to mark complete: ");
                    int completeIndex = scanner.nextInt() - 1;
                    if (completeIndex >= 0 && completeIndex < taskCount) {
                        if (completed[completeIndex]) {
                            System.out.println("⚠️ Task already completed!");

                        } else {
                            completed[completeIndex] = true;
                            System.out.println("✅ Task marked as complete!");
                        }

                    } else {
                        System.out.println("❌ Invalid task number!");
                    }
                    break;

                case 4:
                    if (taskCount == 0) {
                        System.out.println("📋 No tasks to delete!");
                        break;
                    }

                    // Show tasks with numbers
                    System.out.println("\n════════ TASKS ════════");
                    for (int i = 0; i < taskCount; i++) {
                        String status = completed[i] ? "✔️" : "";
                        System.out.printf("%d. %s %s\n", (i + 1), status, tasks[i]);
                    }

                    System.out.println("Enter task number to delete: ");
                    int deleteIndex = scanner.nextInt() - 1;

                    if (deleteIndex >= 0 && deleteIndex < taskCount) {
                        // Shift element to fill the gap
                        for (int i = deleteIndex; i < taskCount - 1; i++) {
                            tasks[i] = tasks[i + 1];
                            completed[i] = completed[i + 1];
                        }

                        // Clear last element
                        tasks[taskCount - 1] = null;
                        completed[taskCount - 1] = false;
                        taskCount--;

                        System.out.println("✅ Task deleted successfully!");
                    } else {
                        System.out.println("❌ Invalid task number!");
                    }
                    break;
                case 5:
                    System.out.println("\n👋 Thank you for using Todo List Manager!");
                    System.out.println("Good bye!");
                    running = false;
                    break;
                default:
                    System.err.println("❌ Invalid option! Please choose between 1-5.");
                    break;
            }

            scanner.nextLine(); // Clear buffer
            scanner.close();
        }
    }
}
