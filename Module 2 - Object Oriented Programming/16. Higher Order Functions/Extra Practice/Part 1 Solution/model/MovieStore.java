package model;

import java.util.ArrayList;
import java.util.List;

public class MovieStore {
    private List<Movie> movies;

    public MovieStore() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> filterByGenre(String genre) {
        return movies.stream()
                .filter(movie -> movie.getGenre().equalsIgnoreCase(genre))
                .toList();
    }

    public List<Movie> sortByReleaseYear() {
        return movies.stream()
                .sorted((movie1, movie2) -> Integer.compare(movie1.getReleaseYear(), movie2.getReleaseYear()))
                .toList();
    }

    public List<Movie> getTopRatedMovies(int n) {
        return movies.stream()
                .sorted((movie1, movie2) -> Double.compare(movie2.getRating(), movie1.getRating()))
                .limit(n)
                .toList();
    }

}