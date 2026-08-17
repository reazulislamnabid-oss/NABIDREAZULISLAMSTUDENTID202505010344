public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("John", "P001");
        Person p2 = new Student("Ali", "S001");
        Person p3 = new Lecturer("David", "L001");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}