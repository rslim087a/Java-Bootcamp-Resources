public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        System.out.println("Circumference: " + circle.getCircumference());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Larger radius: " + circle.getLargerRadius(3.0));
        System.out.println("Smaller radius: " + circle.getSmallerRadius(1.0));
        System.out.println("Radius squared: " + circle.getRadiusSquared());
        System.out.println("Radius square root: " + circle.getRadiusSquareRoot());
    }
}
