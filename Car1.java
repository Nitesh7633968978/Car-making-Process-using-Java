class Car1 {

    // Class variables
    String companyName;
    String color;
    int sittingCap;
    int maxSpeed;
    String model1;
    String fuelType;

    // Constructor
    Car1(String companyName, String model1, String fuelType, String color, int sittingCap, int maxSpeed) {
        this.companyName = companyName;
        this.model1 = model1;
        this.fuelType = fuelType;
        this.color = color;
        this.sittingCap = sittingCap;
        this.maxSpeed = maxSpeed;
    }

    // Method to start the car
    public void start() {
        System.out.println("Car1 started...");
    }

    // Method to drive the car1
    public void drive() {
        System.out.println("Car1 is in driving mode...");
    }

    // Method to apply brakes
    public void brake() {
        System.out.println("Brake applied...");
    }

    // Main method
    public static void main(String[] args) {
        // Create a car1 object
        Car1 myCar1 = new Car1("Tata", "Nano", "CNG", "Pink", 5, 200);

        // Call methods on the car object
        System.out.println("Car1 Details:");
        System.out.println("Company Name: " + myCar1.companyName);
        System.out.println("Model: " + myCar1.model1);
        System.out.println("Fuel Type: " + myCar1.fuelType);
        System.out.println("Color: " + myCar1.color);
        System.out.println("Sitting Capacity: " + myCar1.sittingCap);
        System.out.println("Max Speed: " + myCar1.maxSpeed + " km/h");

        myCar1.start();
        myCar1.drive();
        myCar1.brake();
    }
}