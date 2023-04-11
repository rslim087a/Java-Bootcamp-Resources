import java.util.ArrayList;

public class MagazineLibrary {
    private ArrayList<Magazine> magazines;

    public MagazineLibrary() {
        this.magazines = new ArrayList<>();
    }

    public Magazine getMagazine(int index) {
        Magazine magazine = magazines.get(index);
        return new Magazine(magazine);
    }

    public void setMagazine(Magazine magazine, int index) {
        magazines.set(index, new Magazine(magazine));
    }

    public void addMagazine(Magazine magazine) {
        magazines.add(new Magazine(magazine));
    }
}
