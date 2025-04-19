class Car {
    String model;
    int year;

    // Default constructor
    Car() {
        model = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    Car(String m, int y) {
        model = m;
        year = y;
    }

    // Overloaded method
    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    // Overloaded method with different parameters
    void display(String owner) {
        System.out.println("Owner: " + owner + ", Model: " + model + ", Year: " + year);
    }
}

public class Exp2_ConstructorsOverloading {
    public static void main(String[] args) {
        Car c1 = new Car(); // default constructor
        Car c2 = new Car("Hyundai", 2022); // parameterized constructor

        c1.display();
        c2.display("Vidhi");
    }
}
