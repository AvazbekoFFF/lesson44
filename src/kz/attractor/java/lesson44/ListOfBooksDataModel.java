package kz.attractor.java.lesson44;

import java.util.ArrayList;
import java.util.List;

public class ListOfBooksDataModel {
    private List<ListOfBooks> listOfBooks = new ArrayList<>();

    public ListOfBooksDataModel(){
        listOfBooks.addAll(List.of(new ListOfBooks("Harry Poter: Part 1", "issued", "Alex")));
        listOfBooks.addAll(List.of(new ListOfBooks("Harry Poter: Part 2", "issued", "John")));
    }

    public List<ListOfBooks> getListOfBooks() {
        return listOfBooks;
    }
}
