public class Student extends Person implements FeePayable {

    private String program;
    private Course course;
    private double tuitionFee;
    private double paidFee;

    public Student(long studentId, String name, String program) {
        super(studentId, name);
        this.program = program;
        this.tuitionFee = 5000.0;
        this.paidFee = 0.0;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Course getCourse() {
        return course;
    }

    public void enrollCourse(Course course) {
        this.course = course;
    }

    @Override
    public void payFee(double amount) {
        paidFee += amount;
    }

    @Override
    public void viewFeeStatus() {
        System.out.println("\n------ Tuition Fee Status ------");
        System.out.println("Total Fee : RM " + tuitionFee);
        System.out.println("Paid Fee  : RM " + paidFee);
        System.out.println("Balance   : RM " + (tuitionFee - paidFee));
    }

    @Override
    public void displayInfo() {
        System.out.println("\n------ Student Information ------");
        System.out.println("Student ID : " + getStudentId());
        System.out.println("Name       : " + getName());
        System.out.println("Program    : " + program);

        if (course != null) {
            System.out.println("Course     : " + course.getCourseName());
        } else {
            System.out.println("Course     : Not Enrolled");
        }
    }
}