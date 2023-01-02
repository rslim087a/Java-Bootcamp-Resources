package product;

public class Shirt {

    private double price;
    private String color;
    private String brand;
    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }


}
