public class Main {
    public static void main(String[] args) {
        
        Employee john = new Employee("John", 45);
        Employee lisa = new Employee("Lisa", 20);

        System.out.println("Retirement Age: " + 65);
        System.out.println("Minimum Working Age: " + 18);

        System.out.println(john.getName() + ", you can retire in " + (65 - john.getAge()) + " years.");
        System.out.println(lisa.getName() + ", you have been eligible to work for " + (lisa.getAge() - 18) + " years.");

    }
}
