package shape;

public class Cylinder extends Shape {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * super.getRadius() * this.height + 2 * Math.PI * Math.pow(super.getRadius(), 2);
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(super.getRadius(), 2) * this.height;
    }
  
}
  