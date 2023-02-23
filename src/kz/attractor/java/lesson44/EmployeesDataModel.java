package kz.attractor.java.lesson44;

import kz.attractor.java.lesson44.FileManager.FileService;

import java.util.ArrayList;
import java.util.List;

public class EmployeesDataModel {
    private List<Employees> employees = new ArrayList<>();

//    public List<Employees> getEmployees() {
//        return employees;
//    }

    public void setEmployees(List<Employees> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "EmployeesDataModel{" +
                "employees=" + employees +
                '}';
    }

    public EmployeesDataModel() {
        employees.addAll(List.of(new Employees("Alex", "Walker", 24)));
        employees.addAll(List.of(new Employees("John", "Karry", 28)));
    }

    public List<Employees> getEmployees() {
        return employees;
    }
}
