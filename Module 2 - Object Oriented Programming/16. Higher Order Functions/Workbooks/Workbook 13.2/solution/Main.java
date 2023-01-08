import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(55.99, 33.99, 88.99, 11.49, 55.99, 111.99, 77.99);
        prices.sort((right, left) -> left.compareTo(right));

        System.out.println("\nPrices\n------");
        prices.forEach((price) -> System.out.println(price));

        List<String> books = Arrays.asList(
            "To Kill a Mockingbird",
            "The Great Gatsby",
            "Pride and Prejudice",
            "The Catcher in the Rye",
            "The Alchemist",
            "One Hundred Years of Solitude",
            "Moby-Dick",
            "The Brothers Karamazov",
            "The Lord of the Rings",
            "The Picture of Dorian Gray"
        );

        books.sort((right, left) -> right.compareTo(left));

        System.out.println("\nLibrary\n--------");
        books.forEach((book) -> System.out.println(book));

    }
}