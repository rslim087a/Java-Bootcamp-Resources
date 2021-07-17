public class Car {
    private String make;
    private int year;

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public Car(Car source) {
        this.make = source.make;
        this.year = source.year;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Car)) {
            return false;
        }
        Car car = (Car) obj;
        return this.make.equals(car.make) && this.year == car.year;
    }

}
