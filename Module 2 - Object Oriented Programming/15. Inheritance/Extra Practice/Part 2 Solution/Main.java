import model.*;

public class Main {
    public static void main(String[] args) {
        Microscope microscope1 = new Microscope("Nikon", "E200", 2021, 1000);
        Centrifuge centrifuge1 = new Centrifuge("Eppendorf", "5424R", 2020, 15000);

        // Test the copy constructors
        Microscope microscopeCopy = new Microscope(microscope1);
        Centrifuge centrifugeCopy = new Centrifuge(centrifuge1);

        System.out.println("Original Microscope: " + microscope1.getManufacturer() + " " + microscope1.getModel());
        System.out.println("Copied Microscope: " + microscopeCopy.getManufacturer() + " " + microscopeCopy.getModel());

        System.out.println("Original Centrifuge: " + centrifuge1.getManufacturer() + " " + centrifuge1.getModel());
        System.out.println("Copied Centrifuge: " + centrifugeCopy.getManufacturer() + " " + centrifugeCopy.getModel());

        Lab lab = new Lab();

        // Test the addLabEquipment method
        lab.addLabEquipment(microscope1);
        lab.addLabEquipment(centrifuge1);

        // Test the getLabEquipment method
        LabEquipment retrievedLabEquipment = lab.getLabEquipment(0);
        System.out.println("Retrieved Lab Equipment: " + retrievedLabEquipment.getManufacturer() + " " + retrievedLabEquipment.getModel());

        // Test the setLabEquipment method
        Microscope microscope2 = new Microscope("Olympus", "CX23", 2021, 400);
        lab.setLabEquipment(microscope2, 0);

        // Verify that the lab equipment was updated
        retrievedLabEquipment = lab.getLabEquipment(0);
        System.out.println("Updated Lab Equipment: " + retrievedLabEquipment.getManufacturer() + " " + retrievedLabEquipment.getModel());
    }
}
