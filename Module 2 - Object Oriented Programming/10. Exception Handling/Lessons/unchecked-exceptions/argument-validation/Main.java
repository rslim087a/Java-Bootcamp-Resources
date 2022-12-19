import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        User user = new User();
        System.out.println("We are setting up your user account.");

        System.out.print("Your username is currently " + user.getUsername() + ". Please update it here: ");
        user.setUsername(user.getUsername());
        
        System.out.print("Your age is currently " + user.getAge() + ". Please update it here: ");
        user.setAge(scanner.nextInt());
        scanner.close();
    }     
}