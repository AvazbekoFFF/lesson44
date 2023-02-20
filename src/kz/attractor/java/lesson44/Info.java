package kz.attractor.java.lesson44;

public class Info {
    private String booksInfo;
    private String employees;
    private String employeeBooks;

    public Info(String booksInfo, String employees, String employeeBooks) {
        this.booksInfo = booksInfo;
        this.employees = employees;
        this.employeeBooks = employeeBooks;
    }

    public String getBooksInfo() {
        return booksInfo;
    }

    public void setBooksInfo(String booksInfo) {
        this.booksInfo = booksInfo;
    }


    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getEmployeeBooks() {
        return employeeBooks;
    }

    public void setEmployeeBooks(String employeeBooks) {
        this.employeeBooks = employeeBooks;
    }

}
