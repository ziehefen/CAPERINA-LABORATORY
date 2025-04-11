import java.util.Scanner;
 
// Base class
class Vehicle {
    private String brand;
    private int speed;
    private String fuelType;
 
    public Vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }
 
    public String getBrand() {
        return brand;
    }
 
    public int getSpeed() {
        return speed;
    }
 
    public String getFuelType() {
        return fuelType;
    }
 
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}
 
// Subclass Car
class Car extends Vehicle {
    private int numDoors;
 
    public Car(String brand, int speed, String fuelType, int numDoors) {
        super(brand, speed, fuelType);
        this.numDoors = numDoors;
    }
 
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}
 
// Subclass Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;
 
    public Motorcycle(String brand, int speed, String fuelType, boolean hasSidecar) {
        super(brand, speed, fuelType);
        this.hasSidecar = hasSidecar;
    }
 
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}
 
// Test class with user input
public class testVehicle {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
 
        // Input for Car
        System.out.println("Enter Car Details:");
        System.out.print("Brand: ");
        String carBrand = scanner.nextLine();
 
        System.out.print("Speed: ");
        int carSpeed = scanner.nextInt();
        scanner.nextLine();
 
        System.out.print("Fuel Type: ");
        String carFuel = scanner.nextLine();
 
        System.out.print("Number of Doors: ");
        int numDoors = scanner.nextInt();
        scanner.nextLine();
 
        // Input for Motorcycle
        System.out.println("\nEnter Motorcycle Details:");
        System.out.print("Brand: ");
        String motoBrand = scanner.nextLine();
 
        System.out.print("Speed: ");
        int motoSpeed = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Fuel Type: ");
        String motoFuel = scanner.nextLine();
 
        System.out.print("Has Sidecar? (true/false): ");
        boolean hasSidecar = scanner.nextBoolean();
 
        // Creating objects
        Vehicle Car = new Car(carBrand, carSpeed, carFuel, numDoors);
        Vehicle motorcycle = new Motorcycle(motoBrand, motoSpeed, motoFuel, hasSidecar);
 
        // Display details
        System.out.println("\nCar Details:");
        Car.displayInfo();
 
        System.out.println();
        System.out.println("Motorcycle Details:");
        motorcycle.displayInfo();
 
        scanner.close();
    }
}