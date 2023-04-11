import java.util.Scanner;

public class Main {
 
    static String[] files = new String[] { "data/sales1.csv", "data/sales2.csv", "data/sales3.csv"};
   
    static int sampleSize = 0;
    static int quantitySold = 0;


    public static void main(String[] args) throws Exception {
     
            // execute tasks here
     
            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter your name to access the Global Superstore data: ");
            String name = scan.nextLine();
            System.out.println("\nThank you " + name + ".\n");
            scan.close();
            
     
    }

}
