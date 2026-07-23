public class Course {

    private String courseCode;
    private String courseName;
    private int creditHour;

    public Course(String courseCode, String courseName, int creditHour) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHour = creditHour;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCreditHour() {
        return creditHour;
    }

    public void setCreditHour(int creditHour) {
        this.creditHour = creditHour;
    }

    public void displayCourse() {
        System.out.println("Course Code : " + courseCode);
        System.out.println("Course Name : " + courseName);
        System.out.println("Credit Hour : " + creditHour);
    }
}