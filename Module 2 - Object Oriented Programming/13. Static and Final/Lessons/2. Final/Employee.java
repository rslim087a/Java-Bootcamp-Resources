public class Employee {

    private String name;
    private int age;
    
    public Employee(String name, int age) {
        setAge(age);
        setName(name);
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("INVALID NAME");
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 65) throw new IllegalArgumentException("INVALID AGE");
        this.age = age;
    }

}