public abstract class Person {

    private long studentId;
    private String name;

    public Person(long studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void displayInfo();
}