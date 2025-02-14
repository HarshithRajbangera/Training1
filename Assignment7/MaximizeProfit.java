package placement;
import java.util.*;

class Task {
    String name;
    int deadline, profit;

    public Task(String name, int deadline, int profit) {
        this.name = name;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class MaximizeProfit {
    public static int jobScheduling(List<Task> tasks) {
        // Sort tasks in descending order of profit
        tasks.sort((a, b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for (Task task : tasks) {
            maxDeadline = Math.max(maxDeadline, task.deadline);
        }

        String[] schedule = new String[maxDeadline + 1]; // To store scheduled tasks
        boolean[] slotFilled = new boolean[maxDeadline + 1]; // To track filled slots

        int totalProfit = 0;
        List<String> selectedTasks = new ArrayList<>();

        for (Task task : tasks) {
            for (int i = Math.min(task.deadline, maxDeadline); i > 0; i--) {
                if (!slotFilled[i]) {
                    schedule[i] = task.name;
                    slotFilled[i] = true;
                    totalProfit += task.profit;
                    selectedTasks.add(task.name);
                    break;
                }
            }
        }

        // Print the scheduled tasks
        System.out.println("Scheduled Tasks: " + selectedTasks);
        return totalProfit;
    }

    public static void main(String[] args) {
        List<Task> tasks = Arrays.asList(
            new Task("Task1", 2, 100),
            new Task("Task2", 1, 50),
            new Task("Task3", 2, 10),
            new Task("Task4", 1, 20),
            new Task("Task5", 3, 30)
        );

        int maxProfit = jobScheduling(tasks);
        System.out.println("Max Profit = " + maxProfit);
    }
}

