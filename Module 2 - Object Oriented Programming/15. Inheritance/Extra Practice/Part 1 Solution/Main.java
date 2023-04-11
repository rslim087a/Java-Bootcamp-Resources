import model.Centrifuge;
import model.Microscope;

public class Main {
    public static void main(String[] args) {
        Microscope microscope = new Microscope("Nikon", "E200", 2021, 1000);
        System.out.println("Microscope Details:");
        System.out.println("Manufacturer: " + microscope.getManufacturer());
        System.out.println("Model: " + microscope.getModel());
        System.out.println("Year: " + microscope.getYear());
        System.out.println("Magnification: " + microscope.getMagnification());
        System.out.println("Maintenance: " + microscope.performMaintenance());
        System.out.println();

        Centrifuge centrifuge = new Centrifuge("Eppendorf", "5424R", 2020, 15000);
        System.out.println("Centrifuge Details:");
        System.out.println("Manufacturer: " + centrifuge.getManufacturer());
        System.out.println("Model: " + centrifuge.getModel());
        System.out.println("Year: " + centrifuge.getYear());
        System.out.println("Max RPM: " + centrifuge.getMaxRPM());
        System.out.println("Maintenance: " + centrifuge.performMaintenance());
    }
}
