package src.main;

import java.util.concurrent.TimeUnit;

public class Main {

    static String ACCOUNTS_FILE = "src/main/data/accounts.txt";
    static String TRANSACTIONS_FILE = "src/main/data/transactions.txt";

    public static void main(String[] args) {


    }

    /**
     * Function name: wait
     * @param sec
     * 
     * Inside the function:
     *  1. Makes the code sleep for X seconds.
     */

     public static void wait(int sec) {
         try {
            TimeUnit.SECONDS.sleep(sec);
         } catch (InterruptedException e) {
             System.out.println(e.getMessage());
         }
     }

}
