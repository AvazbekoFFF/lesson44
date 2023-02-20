package kz.attractor.java.lesson44;

public class EmployeeBook {
    private String name;
    private String lastname;
    private Integer age;
    private String takenBook;
    private String readsNow;

    public EmployeeBook(String name, String lastname, Integer age, String takenBook, String readsNow) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.takenBook = takenBook;
        this.readsNow = readsNow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTakenBook() {
        return takenBook;
    }

    public void setTakenBook(String takenBook) {
        this.takenBook = takenBook;
    }

    public String getReadsNow() {
        return readsNow;
    }

    public void setReadsNow(String readsNow) {
        this.readsNow = readsNow;
    }
}
