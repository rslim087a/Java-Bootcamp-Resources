import shape.Cylinder;
import shape.Shape;
import shape.Sphere;

public class Main {

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(1.0, 2.0);
        Sphere sphere = new Sphere(1.0);

        printMeasures(cylinder);
        printMeasures(sphere);
    }

    public static void printMeasures(Shape shape) {
        System.out.println("\n" + shape.getClass().getSimpleName());
        System.out.println("Area: " + shape.getArea());
        System.out.println("Volume: " + shape.getVolume());
    }

}
  