import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TaskFileHandler {

    private static final String FILE_NAME = "tasks.txt";

    // Save tasks to file
    public static void saveTasks(ArrayList<String> tasks) {

        try {
            FileWriter writer = new FileWriter(FILE_NAME);

            for (String task : tasks) {
                writer.write(task);
                writer.write(System.lineSeparator());
            }

            writer.close();

            System.out.println("Tasks saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }

    // Load tasks from file
    public static ArrayList<String> loadTasks() {

        ArrayList<String> tasks = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(FILE_NAME)
            );

            String line;

            while ((line = reader.readLine()) != null) {
                tasks.add(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error loading tasks: " + e.getMessage());
        }

        return tasks;
    }
}