import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("The Alchemist", "Fantasy", 1988, 15.42),
            new Book("The Giver", "Dystopian", 1993, 14.98),
            new Book("Jane Eyre", "Romance", 1847, 11.94),
            new Book("The Picture of Dorian Gray", "Gothic", 1890, 13.18),
            new Book("The Great Gatsby", "Tragedy", 1925, 14.60),
            new Book("To Kill a Mockingbird", "Coming of Age", 1960, 12.84),
            new Book("The Catcher in the Rye", "Realistic Fiction", 1951, 9.22),
            new Book("Pride and Prejudice", "Romance", 1813, 13.42),
            new Book("1984", "Dystopian", 1949, 11.68),
            new Book("Wuthering Heights", "Romance", 1847, 16.16),
            new Book("Moby Dick", "Adventure", 1851, 15.42),
            new Book("The Heart of Darkness", "Adventure", 1899, 13.80),
            new Book("The Old Man and the Sea", "Adventure", 1952, 11.90),
            new Book("The Time Machine", "Science Fiction", 1895, 12.96),
            new Book("The Picture of Dorian Gray", "Gothic", 1890, 13.94)
        );

        System.out.println("\nThese books are on sale\n-----------------------");
        books.stream() 
            .filter(book -> book.getGenre().equals("Romance"))
            .map(book -> new Book(book.getTitle(), book.getGenre(), book.getYear(), book.getPrice() / 2))
            .sorted((right, left) -> right.getYear().compareTo(left.getYear()))
            .forEach(book -> System.out.println(book));
    }
}
