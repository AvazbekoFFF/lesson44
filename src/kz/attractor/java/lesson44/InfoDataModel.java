package kz.attractor.java.lesson44;

public class InfoDataModel {
   private Info info;

    public InfoDataModel() {
        this.info = new Info("Book lending journal", "List of Employees", "List of employees taken books");
    }

    public Info getInfo() {
        return info;
    }
}
