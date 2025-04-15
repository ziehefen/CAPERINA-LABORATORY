// Student.java - Subclass that extends Person
public class Student extends Person {
    String gradeLevel;
    
    // Constructor to initialize name, id, and gradeLevel
    public Student(String name, int id, String gradeLevel) {
        super(name, id); 
        this.gradeLevel = gradeLevel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade Level: " + gradeLevel);
    }
}
