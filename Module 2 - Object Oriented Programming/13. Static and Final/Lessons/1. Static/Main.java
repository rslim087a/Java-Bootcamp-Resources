public class Main {
    public static void main(String[] args) {
        
        User liam = new User("Liam", "Smith");
        User olivia = new User("Olivia", "Davis");
        User ethan = new User("Ethan", "Martins");

        System.out.println(liam.getFirstName() + " " + liam.getLastName());
        System.out.println(olivia.getFirstName() + " " + olivia.getLastName());
        System.out.println(ethan.getFirstName() + " " + ethan.getLastName());
        System.out.println("User Count: " + "<count>");

    }
}