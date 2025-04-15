// Staff.java - Subclass that extends Person
public class Staff extends Person {
    String department; 

    // Constructor to initialize name, id, and department
    public Staff(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
