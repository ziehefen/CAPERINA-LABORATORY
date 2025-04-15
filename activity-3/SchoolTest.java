import java.util.Scanner;

// SchoolTest.java - Main class to test the program
public class SchoolTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter details for the Student
        System.out.println("Enter Student's Name: ");
        String studentName = scanner.nextLine(); 
        System.out.println("Enter Student's ID: ");
        int studentId = scanner.nextInt(); 
        scanner.nextLine();
        System.out.println("Enter Student's Grade Level: ");
        String gradeLevel = scanner.nextLine();

        // Create a Student object using user input
        Student student = new Student(studentName, studentId, gradeLevel);

        // Prompt the user to enter details for the Teacher
        System.out.println("Enter Teacher's Name: ");
        String teacherName = scanner.nextLine();
        System.out.println("Enter Teacher's ID: ");
        int teacherId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Teacher's Subject: ");
        String subject = scanner.nextLine();

        // Create a Teacher object using user input
        Teacher teacher = new Teacher(teacherName, teacherId, subject);

        // Prompt the user to enter details for the Staff
        System.out.println("Enter Staff Member's Name: ");
        String staffName = scanner.nextLine();
        System.out.println("Enter Staff Member's ID: ");
        int staffId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Staff Member's Department: ");
        String department = scanner.nextLine();

        // Create a Staff object using user input
        Staff staff = new Staff(staffName, staffId, department);

        // Display the information of the student
        System.out.println("\n=== Student Info ===");
        student.displayInfo();
        System.out.println();

        // Display the information of the teacher
        System.out.println("=== Teacher Info ===");
        teacher.displayInfo();
        System.out.println();

        // Display the information of the staff member
        System.out.println("=== Staff Info ===");
        staff.displayInfo();

        // Close the scanner
        scanner.close();
    }
}
