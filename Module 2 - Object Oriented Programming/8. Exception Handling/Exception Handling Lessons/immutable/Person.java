public class Person {
    private String name;
    private String nationality;

    public Person(String name, String nationality) {
        if (name == null || name.isBlank() || nationality == null || nationality.isBlank()) {
            throw new IllegalArgumentException("fields cannot be null/blank");
        }
        this.name = name;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }


}
