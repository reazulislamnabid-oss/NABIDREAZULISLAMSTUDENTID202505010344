import java.util.Scanner;

public class Menu {

    private StudentManager manager;
    private Scanner sc = new Scanner(System.in);

    public Menu() {
        manager = new StudentManager(sc);
    }

    public void start() {

        int choice;

        do {

            System.out.println("\n=========================================");
            System.out.println("      STUDENT MANAGEMENT SYSTEM");
            System.out.println("=========================================");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Enroll Course");
            System.out.println("7. Display Student Details");
            System.out.println("8. Pay Tuition Fee");
            System.out.println("9. View Tuition Fee Status");
            System.out.println("10. Exit");
            System.out.println("=========================================");
            System.out.print("Enter Your Choice : ");

            choice = 0;
            boolean validInput = false;
            while (!validInput) {
                try {
                    choice = sc.nextInt();
                    validInput = true;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a numeric choice.");
                    sc.nextLine(); // Clear invalid input
                    System.out.print("Enter Your Choice : ");
                }
            }

            switch (choice) {

                case 1:
                    manager.addStudent();
                    break;

                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    manager.searchStudent();
                    break;

                case 4:
                    manager.updateStudent();
                    break;

                case 5:
                    manager.deleteStudent();
                    break;

                case 6:
                    manager.enrollCourse();
                    break;

                case 7:
                    manager.displayStudentDetails();
                    break;

                case 8:
                    manager.payTuitionFee();
                    break;

                case 9:
                    manager.viewFeeStatus();
                    break;

                case 10:
                    System.out.println("Thank You...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 10);
    }
}