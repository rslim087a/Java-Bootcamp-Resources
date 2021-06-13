public class Main {
    public static void main(String[] args) {
        Employee stocker = new Employee("   ", null);
        Employee assisManager = new Employee("Nicholas", "     ");
        Employee manager = new Employee(null, "      ");

        Store store = new Store();

        System.out.println(store);
        store.open();
        
    }
}
