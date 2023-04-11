package model;

public class Movie {
    private String title;
    private String director;
    private String genre;
    private int releaseYear;
    private double rating;

    public Movie(String title, String director, String genre, int releaseYear, double rating) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return title + " (" + releaseYear + ") - Directed by " + director + ", Genre: " + genre + ", Rating: " + rating;
    }
}
