public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getLargerRadius(double otherRadius) {
        return Math.max(radius, otherRadius);
    }

    public double getSmallerRadius(double otherRadius) {
        return Math.min(radius, otherRadius);
    }

    public double getRadiusSquared() {
        return Math.pow(radius, 2);
    }

    public double getRadiusSquareRoot() {
        return Math.sqrt(radius);
    }

}