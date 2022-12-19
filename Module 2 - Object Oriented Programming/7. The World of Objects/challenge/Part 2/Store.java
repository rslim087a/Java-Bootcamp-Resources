public class Store {

    private Movie[] movies;

    public Store() {
        // TODO
    }

    public Movie getMovie(int index) {
        // TODO 
        return null;
    }

    public void setMovie(int index, Movie movie) {
        // TODO 
    }


    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}
