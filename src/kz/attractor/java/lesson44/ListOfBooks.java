package kz.attractor.java.lesson44;

public class ListOfBooks {
    private String name;
    private String status;
    private String nameOfEmployee;

    public ListOfBooks(String name, String status, String nameOfEmployee) {
        this.name = name;
        this.status = status;
        this.nameOfEmployee = nameOfEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNameOfEmployee() {
        return nameOfEmployee;
    }

    public void setNameOfEmployee(String nameOfEmployee) {
        this.nameOfEmployee = nameOfEmployee;
    }
}
