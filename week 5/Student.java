public class Student {

    // Private variables - Encapsulation
    private String studentID;
    private String name;
    private double cgpa;

    // Setter for Student ID
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for CGPA
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    // Getter for Student ID
    public String getStudentID() {
        return studentID;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Getter for CGPA
    public double getCGPA() {
        return cgpa;
    }
}