import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        

        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.
        //Ask for their last name.
        //Ask: how old are you?
        /* Ask them to make a username. SIDE NOTE:
           - You will encounter the nextLine() Trap here.
           - Workbook 2.5 article explains how to avoid it.
           - The "Delimiters" lesson (next section) explains why the trap happens. Until you reach the Delimiters lesson, 
           please refrain from asking why nextLine() is being skipped. The Discord has been flooded with that question :D.
           Thank you!
        */
        //Ask what city they live in.
        //Ask what country that's from.


        //Task 2 - Print their information. 

        System.out.println("Thank you for joining JavaGram!");

        //Print their information like so:

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //


        //close scanner. It's good practice :D ! 
    }
}
