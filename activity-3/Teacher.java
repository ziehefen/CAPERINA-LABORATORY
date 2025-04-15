// Teacher.java - Subclass that extends Person
public class Teacher extends Person {
    String subject;

    // Constructor to initialize name, id, and subject
    public Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    // Override displayInfo method to include subject information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}
