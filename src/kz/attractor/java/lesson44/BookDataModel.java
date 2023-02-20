package kz.attractor.java.lesson44;

public class BookDataModel {
    private Book book;

    public BookDataModel() {
        this.book = new Book("https://static1.colliderimages.com/wordpress/wp-content/uploads/2021/11/hp7.jpg", "Harry Potter: Part 1", "Jane Blum", "fantasy", 1987);
    }

    public Book getBook() {
        return book;
    }
}
