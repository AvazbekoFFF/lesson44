package kz.attractor.java.lesson44;

import kz.attractor.java.lesson44.FileManager.FileService;

import java.util.List;

public class BookDataModel {
    private List<Book> books = FileService.readFileBook();

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
