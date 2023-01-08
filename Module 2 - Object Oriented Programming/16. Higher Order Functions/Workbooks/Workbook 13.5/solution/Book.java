public class Book {

    private String title;
    private String genre;
    private Integer year;
    private Double price;

    public Book(String title, String genre, int year, double price) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getYear() {
        return this.year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public String toString() {
        return this.genre + "  " + this.year + "  $" + this.price + "  " + this.title;
    }

}
    