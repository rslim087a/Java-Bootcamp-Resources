package src.main;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import src.main.models.Game;
import src.main.models.Team;

public class Main {

    static Game game;
    static final String TEAMS_FILE = "src/main/teams.txt";
    static final String PLAYS_FILE = "src/main/plays.txt";

    public static void main(String[] args) {
        try {
            String[][] data = getData();
            game = new Game(
                new Team(data[0][0], data[0][1], data[0][2], new String[] {data[0][3], data[0][4], data[0][5]}),
                new Team(data[1][0], data[1][1], data[1][2], new String[] {data[1][3], data[1][4], data[1][5]})
            );
            startGame();
            printResult();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

          
    }


    /**
     * Function name: getData
     * @return (String[][])
     * @throws FileNotFoundException
     * 
     * Inside the function:
     *   1. Returns data from TEAMS_FILE as a String[][] array
     */
    public static String[][] getData() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(TEAMS_FILE);
        Scanner scanFile = new Scanner(fis);
        String[] lines = new String[] {scanFile.nextLine(), scanFile.nextLine()};
        scanFile.close();
        return new String[][] { lines[0].split(","), lines[1].split(",")};
    }


    /** Function name: startGame
     * 
     * Inside the function:
     *    1. Grabs each play from plays.txt and calls game.simulate(play);
     *    2. Prints the return from game.simulate(play)
     *        - println("\n" + <return> + "\n");
     */
    public static void startGame() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(PLAYS_FILE);
        Scanner scanFile = new Scanner(fis);
        while (scanFile.hasNextLine()) {
            wait(3);
            System.out.println("\n" + game.simulate(scanFile.nextLine()) + "\n");       
        }
        scanFile.close();
    }


    /** Function name: printResult()
     * 
     * Inside the function:
     *    1. Prints the final score: println("\nGRYFFINDOR: " + <gryffindor score> + " SLYTHERIN: " + <slytherin score>);
     *    2. Prints the winner: println("\n" + <winner team name> + " WINS!");
     *  
     */

     public static void printResult() {
         Team gryffindor = game.getTeam("GRYFFINDOR");   
         Team slytherin = game.getTeam("SLYTHERIN");
         Team winner = game.getScore(gryffindor) > game.getScore(slytherin) ? gryffindor : slytherin;
         System.out.println("\nGRYFFINDOR: " + game.getScore(gryffindor) + " SLYTHERIN: " + game.getScore(slytherin));
         System.out.println("\n" + winner.getHouse() + " WINS!");    
     }

    /**
     * Function name: wait
     * @param sec
     * 
     * Inside the function:
     *  1. Make the code sleep for X seconds.
     */

     public static void wait(int sec) {
         try {
            TimeUnit.SECONDS.sleep(sec);
         } catch (InterruptedException e) {
             System.out.println(e.getMessage());
         }
     }


  }
