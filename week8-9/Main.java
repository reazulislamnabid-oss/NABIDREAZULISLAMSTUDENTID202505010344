import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        System.out.println("===== ADD TASKS =====");

        // Allow user to enter 3 tasks
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter Task " + i + ": ");
            String task = input.nextLine();
            tasks.add(task);
        }

        // Display tasks
        System.out.println();
        System.out.println("===== TASK LIST =====");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        input.close();
    }
}