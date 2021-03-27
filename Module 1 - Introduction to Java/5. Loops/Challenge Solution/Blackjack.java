import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();

        int card1 = drawRandomCard();
        int card2 = drawRandomCard();

        System.out.println("\n You get a \n" + cardString(card1) + "\n and a \n" + cardString(card2));
        int total = Math.min(card1, 10) + Math.min(card2, 10);
        System.out.println("your total is: " + total);
        
        int dealerCard1 = drawRandomCard();
        int dealerCard2 = drawRandomCard();        

        System.out.println("\n The dealer shows \n" + cardString(dealerCard1) + "\nand has a card facing down \n"
        + faceDown());
        int dealerTotal = Math.min(dealerCard1, 10) + Math.min(dealerCard2, 10);
        System.out.println("\nThe dealer's total is hidden");
       
        while (true) {
            String option = hitOrStay();

            if (option.equals("stay")) {
                break;
            }
            int newCard = drawRandomCard();
            total += Math.min(newCard, 10);
            System.out.println("\nYou get a\n" + cardString(newCard));
            System.out.println("your total is " + total);

            if (total > 21) {
                System.out.println("Bust! Player loses");
                System.exit(0);
            }
        }
        System.out.println("\nDealer's turn");
        System.out.println("\n The dealer's cards are \n" + cardString(dealerCard1) 
        + "\n and a \n" + cardString(dealerCard2));
        System.out.println("Dealer's total is " + dealerTotal);

        while (dealerTotal < 17) {
            int newCard = drawRandomCard();

            dealerTotal += Math.min(newCard, 10);
            System.out.println("\n Dealer gets a \n" + cardString(newCard));
            System.out.println("Dealer's total is " + dealerTotal);
        }
        
        if (dealerTotal > 21) {
            System.out.println("Bust! Dealer loses.");
            System.exit(0);
        }

        if (total > dealerTotal) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Dealer wins!");
        }
        //For tasks 9 to 13, see the article: Blackjack Part II. 
         scan.close();

    }


    public static int drawRandomCard() {
        double randomNumber = Math.random() * 13;
        randomNumber += 1;
        return (int)randomNumber;
    }

     public static String cardString(int cardNumber) {
         switch(cardNumber) {
            case 1:   
            return "   _____\n"+
                   "  |A _  |\n"+ 
                   "  | ( ) |\n"+
                   "  |(_'_)|\n"+
                   "  |  |  |\n"+
                   "  |____V|\n";
            case 2:
            return  "   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";
                  
            case 3:
            return"   _____\n" +
                  "  |3    |\n"+
                  "  | o o |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____E|\n";

            case 4:
            return "   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n";

            case 5:
            return  "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";

            case 6:
            return  "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";

            case 7:
            return  
                    "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
          

            case 8:
            return  "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
            case 9:
            return  "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";

            case 10:
            return  "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
            case 11:
            return  "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
            case 12:
            return  "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
            case 13:
            return  "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";

             default: return "not possible";
         }
     }

    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (boolean)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns true if user chooses "hit", false if they choose "stay". 
     */
    public static String hitOrStay() {
        System.out.println("Would you like to hit or stay?");
        String response = scan.nextLine();

        while (!(response.equals("hit") || response.equals("stay"))) {
            System.out.println("Please write hit or stay");
            response = scan.nextLine();
        }
        return response;
    }
}


