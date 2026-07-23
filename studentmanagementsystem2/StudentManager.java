import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    private ArrayList<Student> students;
    private Scanner scanner;

    public StudentManager(Scanner scanner) {
        students = new ArrayList<>();
        this.scanner = scanner;
    }


    // 1. Add Student
    public void addStudent() {

        System.out.println("\n===== ADD STUDENT =====");

        long id = 0;
        boolean validInput = false;
        
        while (!validInput) {
            try {
                System.out.print("Enter Student ID: ");
                id = scanner.nextLong();
                validInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input! Please enter a numeric Student ID.");
                scanner.nextLine(); // Clear invalid input
            }
        }
        scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Program: ");
        String program = scanner.nextLine();


        Student student = new Student(id, name, program);

        students.add(student);

        System.out.println("Student added successfully!");
    }


    // 2. View All Students
    public void viewStudents() {

        System.out.println("\n===== ALL STUDENTS =====");

        if (students.isEmpty()) {
            System.out.println("No student records available.");
        }
        else {

            for(Student student : students) {

                student.displayInfo();

            }
        }
    }


    // 3. Search Student
    public void searchStudent() {

        long id = 0;
        boolean validInput = false;
        
        while (!validInput) {
            try {
                System.out.print("\nEnter Student ID to Search: ");
                id = scanner.nextLong();
                validInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input! Please enter a numeric Student ID.");
                scanner.nextLine(); // Clear invalid input
            }
        }

        for(Student student : students) {

            if(student.getStudentId() == id) {

                System.out.println("Student Found!");
                student.displayInfo();
                return;
            }
        }

        System.out.println("Student not found.");
    }



    // 4. Update Student
    public void updateStudent() {

        long id = 0;
        boolean validInput = false;
        
        while (!validInput) {
            try {
                System.out.print("\nEnter Student ID to Update: ");
                id = scanner.nextLong();
                validInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input! Please enter a numeric Student ID.");
                scanner.nextLine(); // Clear invalid input
            }
        }
        scanner.nextLine();


        for(Student student : students) {


            if(student.getStudentId() == id) {


                System.out.print("Enter New Name: ");
                String name = scanner.nextLine();


                System.out.print("Enter New Program: ");
                String program = scanner.nextLine();


                student.setName(name);
                student.setProgram(program);


                System.out.println("Student updated successfully.");

                return;

            }
        }


        System.out.println("Student not found.");

    }



    // 5. Delete Student
    public void deleteStudent() {

        long id = 0;
        boolean validInput = false;
        
        while (!validInput) {
            try {
                System.out.print("\nEnter Student ID to Delete: ");
                id = scanner.nextLong();
                validInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input! Please enter a numeric Student ID.");
                scanner.nextLine(); // Clear invalid input
            }
        }

        for(Student student : students) {


            if(student.getStudentId() == id) {


                students.remove(student);

                System.out.println("Student deleted successfully.");

                return;

            }
        }


        System.out.println("Student not found.");

    }





    // 6. Enroll Course
    public void enrollCourse() {

        long id = 0;
        boolean validInput = false;
        
        while (!validInput) {
            try {
                System.out.print("\nEnter Student ID: ");
                id = scanner.nextLong();
                validInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input! Please enter a numeric Student ID.");
                scanner.nextLine(); // Clear invalid input
            }
        }
        scanner.nextLine();


        for(Student student : students) {


            if(student.getStudentId() == id) {


                System.out.print("Enter Course Code: ");
                String code = scanner.nextLine();


                System.out.print("Enter Course Name: ");
                String name = scanner.nextLine();


                System.out.print("Enter Credit Hour: ");
                validInput = false;
                int credit = 0;
                while (!validInput) {
                    try {
                        credit = scanner.nextInt();
                        validInput = true;
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Invalid input! Please enter a numeric Credit Hour.");
                        scanner.nextLine();
                    }
                }



                Course course = new Course(code, name, credit);


                student.enrollCourse(course);



                System.out.println("Course enrolled successfully.");

                return;

            }

        }


        System.out.println("Student not found.");

    }





    // 7. Display Student Details
    public void displayStudentDetails() {

        long id = 0;
        boolean validInput = false;
        
        while (!validInput) {
            try {
                System.out.print("\nEnter Student ID: ");
                id = scanner.nextLong();
                validInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input! Please enter a numeric Student ID.");
                scanner.nextLine(); // Clear invalid input
            }
        }


        for(Student student : students) {


            if(student.getStudentId() == id) {


                student.displayInfo();


                if(student.getCourse()!=null){

                    student.getCourse().displayCourse();

                }


                return;

            }

        }


        System.out.println("Student not found.");

    }






    // 8. Pay Tuition Fee
    public void payTuitionFee() {

        int id = 0;
        boolean validInput = false;
        
        while (!validInput) {
            try {
                System.out.print("\nEnter Student ID: ");
                id = scanner.nextInt();
                validInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input! Please enter a numeric Student ID.");
                scanner.nextLine(); // Clear invalid input
            }
        }

        for(Student student : students) {


            if(student.getStudentId()==id) {


                System.out.print("Enter Payment Amount RM: ");
                validInput = false;
                double amount = 0;
                while (!validInput) {
                    try {
                        amount = scanner.nextDouble();
                        validInput = true;
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Invalid input! Please enter a numeric amount.");
                        scanner.nextLine();
                    }
                }



                student.payFee(amount);



                System.out.println("Payment successful.");

                return;

            }

        }


        System.out.println("Student not found.");

    }





    // 9. View Tuition Fee Status
    public void viewFeeStatus() {

        int id = 0;
        boolean validInput = false;
        
        while (!validInput) {
            try {
                System.out.print("\nEnter Student ID: ");
                id = scanner.nextInt();
                validInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input! Please enter a numeric Student ID.");
                scanner.nextLine(); // Clear invalid input
            }
        }



        for(Student student : students) {


            if(student.getStudentId()==id) {


                student.viewFeeStatus();

                return;

            }

        }


        System.out.println("Student not found.");

    }

}