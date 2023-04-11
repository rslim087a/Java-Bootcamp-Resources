import model.Car;
import model.Car.BodyType;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", BodyType.SEDAN, 2020, 30000);
        System.out.println(car1.getMake());

        // Uncomment the following line to test invalid input for setMake method
        // car1.setMake("");

        // Uncomment the following line to test invalid input for setModel method
        // car1.setModel("");

        // Uncomment the following line to test invalid input for setBodyType method
        // car1.setBodyType(null);

        // Uncomment the following line to test invalid input for setProductionYear method
        // car1.setProductionYear(1899);

        // Uncomment the following line to test invalid input for setPrice method
        // car1.setPrice(-1);

        // Uncomment the following line to test invalid input for setPrice method
        // car1.setPrice(200001);

        // Uncomment the following line to test invalid input for the constructor
        // Car car2 = new Car("", "Camry", BodyType.SEDAN, 2020, 30000);
    }
}
