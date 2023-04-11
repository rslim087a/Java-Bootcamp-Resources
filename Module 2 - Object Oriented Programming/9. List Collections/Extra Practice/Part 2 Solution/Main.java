public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 4.27, 15.99);
        Book book2 = new Book("1984", "George Orwell", 4.17, 12.99);
    
        Store store = new Store();
        store.addBook(book1);
        store.addBook(book2);
    
        // Test the getBook method
        Book retrievedBook = store.getBook(0);
        System.out.println(retrievedBook.getTitle());
    
        // Test the setBook method
        Book newBook = new Book("Moby-Dick", "Herman Melville", 3.5, 14.99);
        store.setBook(0, newBook);
    
        // Verify that the book was updated
        retrievedBook = store.getBook(0);
        System.out.println(retrievedBook.getTitle());
    
        // Test the contains method
        System.out.println(store.contains(book2)); // should be true before selling the book
    
        // Test the sellBook method
        store.sellBook("1984");
        System.out.println(store.contains(book2)); // should be false now
    
    }
}