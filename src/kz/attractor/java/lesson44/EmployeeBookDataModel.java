package kz.attractor.java.lesson44;

import java.util.ArrayList;
import java.util.List;

public class EmployeeBookDataModel {
    private List<EmployeeBook> employeesBooks = new ArrayList<>();
    public EmployeeBookDataModel() {
        employeesBooks.addAll(List.of(new EmployeeBook("Alex", "Walker", 24, "Harry Potter: Part 1", "Harry Potter: Part 2")));
        employeesBooks.addAll(List.of(new EmployeeBook("John", "Karry", 28, "Harry Potter: Part 1", "Harry Potter: Part 2")));
    }

    public List<EmployeeBook> getEmployeesBooks() {
        return employeesBooks;
    }

    public void setEmployeesBooks(List<EmployeeBook> employeesBooks) {
        this.employeesBooks = employeesBooks;
    }
}
