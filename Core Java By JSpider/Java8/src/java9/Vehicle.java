package java9;
@FunctionalInterface
interface Vehicle {
	void justforfun();
    default void start() {
        System.out.println(getName() + " is starting...");
    }

    default void stop() {
        System.out.println(getName() + " is stopping...");
    }

    // Private method - only for use inside interface
    private String getName() {
        return "Vehicle";
    }
}

/*
 * 
 * 
 * Without using private — duplicate code (bad)

interface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting...");
    }

    default void stop() {
        System.out.println("Vehicle is stopping...");
    }
}*/
 



/*
 * Without private, using static method (public)
java
Copy
Edit
interface Vehicle {
    default void start() {
        System.out.println(getName() + " is starting...");
    }

    default void stop() {
        System.out.println(getName() + " is stopping...");
    }

    // Static method - public by default
    static String getName() {
        return "Vehicle";
    }
}
✅ No duplicate code
❌ But getName() is public, anyone outside can also call it like Vehicle.getName(), which is not safe.
 * 
 * 
 * */
