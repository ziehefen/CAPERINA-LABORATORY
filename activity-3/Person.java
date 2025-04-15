// Person.java - Base class for all persons
public class Person {
    String name; 
    int id;

    // Constructor to initialize name and id
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display the person's name and ID
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

