import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    static Store store = new Store();

    public static void main(String[] args) {
        try {
            loadMovies("movies.txt");
            printStore();
            userInput();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        String status = "continue";
        while (status.equals("continue")) {

            int choice = (promptForChoice(scanner));
            Movie movie = store.getMovie(choice);
            double rating = promptForRating(scanner, movie.getName());
    
            movie.setRating(rating);
            store.setMovie(choice, movie);
            printStore();
            System.out.print("To edit another rating, type: 'continue': ");
            status = scanner.next();
        }
        scanner.close();
    }

    public static int promptForChoice(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease choose an integer between 0 - 9: ");
            if (!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();
            if (incorrectChoice(choice)) continue;
            else return choice;
        }
    }

    public static boolean incorrectChoice(int choice) {
        return choice < 0 || choice > 9; 
    }

    public static double promptForRating(Scanner scanner, String name) {
        while (true) {
            System.out.print("\nSet a new rating for " + name + ": ");
            if (!scanner.hasNextDouble()) {
                scanner.next();
                continue;
            } 

            double rating = scanner.nextDouble();
            if (incorrectRating(rating)) continue;
            else return rating;
         }
    }

    public static boolean incorrectRating(double rating) {
        return rating < 0 || rating > 10;
    }

     public static void loadMovies(String fileName) throws FileNotFoundException {
         FileInputStream fis = new FileInputStream(fileName);
         Scanner scanFile = new Scanner(fis);

         while (scanFile.hasNextLine()) {
             String line = scanFile.nextLine();
             String[] words = line.split("--");
             store.addMovie(new Movie(words[0], words[1], Double.parseDouble(words[2])));
         }
         scanFile.close();
     }

     public static void printStore() {
        System.out.println("********************************MOVIE STORE*******************************");
        System.out.println(store);
    }


}
