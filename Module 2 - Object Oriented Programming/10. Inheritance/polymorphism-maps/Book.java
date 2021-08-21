import java.util.Objects;

public class Book implements Comparable<Book> {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(Book source) {
        this.name = source.name;
        this.author = source.author;
        this.price = source.price;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(author, book.author) && price == book.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, price);
    }
    

    @Override
    public int compareTo(Book o) {
        return Double.compare(super.getPrice(), o.getPrice());
    }


    @Override
    public String toString() {
        return getName() + "\t" + getAuthor() + "\t" + getPrice();
    }

}
