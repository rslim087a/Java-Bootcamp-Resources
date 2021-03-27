public class AppleStore {
    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;

        System.out.println("You picked 500 apples from an apple orchard");
        numOfApples += 500;
        
        System.out.println("Time for business! You're selling each apple for 40 cents");
        double price = 0.40;

        System.out.println("One customer walked in. He bought 4 apples!");
        numOfApples -= 4;
        numOfCustomers++;
        profit += 4*price;

        System.out.println("Another customer walked in. He bought 20 apples!");
        numOfApples -= 20;
        numOfCustomers++;
        profit += 20*price;

        System.out.println("Another customer walked in. She bought 200 apples!");
        numOfApples -= 200;
        numOfCustomers++;
        profit += 200*price;

        System.out.println("Wow! So far, you made: $" + profit);
        System.out.println(numOfCustomers + " customers love your apples.");
        System.out.println("You have " + numOfApples + " apples left. We'll sell more tomorrow!");

    }

}