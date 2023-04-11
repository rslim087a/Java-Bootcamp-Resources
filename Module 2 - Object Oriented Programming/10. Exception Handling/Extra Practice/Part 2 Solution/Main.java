public class Main {
    public static void main(String[] args) {
        Magazine magazine1 = new Magazine("Magazine 1", "Publisher 1", 1, 2020);
        Magazine magazine2 = new Magazine("Magazine 2", "Publisher 2", 2, 2021);

        MagazineLibrary library = new MagazineLibrary();
        
        // Test the addMagazine method
        library.addMagazine(magazine1);
        library.addMagazine(magazine2);

        // Test the getMagazine method
        Magazine retrievedMagazine = library.getMagazine(0);
        System.out.println(retrievedMagazine.getTitle());

        // Test the setMagazine method
        Magazine newMagazine = new Magazine("Magazine 3", "Publisher 3", 3, 2022);
        library.setMagazine(newMagazine, 0);

        // Verify that the magazine was updated
        retrievedMagazine = library.getMagazine(0);
        System.out.println(retrievedMagazine.getTitle());
    }
}
