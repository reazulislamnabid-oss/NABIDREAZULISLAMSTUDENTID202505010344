public class Main {

    public static void main(String[] args) {

        // Create Student object
        Student s = new Student();

        // Set student information
        s.setStudentID("202505010344");
        s.setName("NABID REAZUL ISLAM");
        s.setCGPA(3.75);

        // Display student information
        System.out.println("Student ID : " + s.getStudentID());
        System.out.println("Name       : " + s.getName());
        System.out.println("CGPA       : " + s.getCGPA());
        System.out.println("Programme  : BIT");
    }
}