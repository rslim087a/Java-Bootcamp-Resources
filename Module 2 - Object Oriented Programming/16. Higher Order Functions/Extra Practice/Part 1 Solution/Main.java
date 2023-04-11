import model.*;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", "Christopher Nolan", "Sci-Fi", 2010, 8.8);
        Movie movie2 = new Movie("The Dark Knight", "Christopher Nolan", "Action", 2008, 9.0);
        Movie movie3 = new Movie("The Matrix", "Lana Wachowski, Lilly Wachowski", "Sci-Fi", 1999, 8.7);
        Movie movie4 = new Movie("Pulp Fiction", "Quentin Tarantino", "Crime", 1994, 8.9);

        MovieStore movieStore = new MovieStore();
        movieStore.addMovie(movie1);
        movieStore.addMovie(movie2);
        movieStore.addMovie(movie3);
        movieStore.addMovie(movie4);

        List<Movie> sciFiMovies = movieStore.filterByGenre("Sci-Fi");
        List<Movie> sortedMovies = movieStore.sortByReleaseYear();
        List<Movie> topRatedMovies = movieStore.getTopRatedMovies(3);

        System.out.println("Sci-Fi Movies:");
        sciFiMovies.forEach(movie -> System.out.println(movie));

        System.out.println("\nSorted by Release Year:");
        sortedMovies.forEach(movie -> System.out.println(movie));

        System.out.println("\nTop Rated Movies:");
        topRatedMovies.forEach(movie -> System.out.println(movie));
    }
}