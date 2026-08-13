public class Lecturer extends Employee {

    private String subject;

    public Lecturer(String id, String name, String subject) {
        super(id, name);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject     : " + subject);
    }
}