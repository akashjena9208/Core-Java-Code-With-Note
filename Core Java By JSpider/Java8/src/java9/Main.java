package java9;

class Car implements Vehicle {
    // No need to implement start() or stop(), they already exist
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();  // Output: Vehicle is starting...
        car.stop();   // Output: Vehicle is stopping...
    }
}

