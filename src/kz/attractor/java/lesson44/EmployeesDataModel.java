package kz.attractor.java.lesson44;

import java.util.ArrayList;
import java.util.List;

public class EmployeesDataModel {
    private List<Employees> employees = new ArrayList<>();

    public EmployeesDataModel(){
        employees.addAll(List.of(new Employees("Alex", "Walker", 24)));
        employees.addAll(List.of(new Employees("John", "Karry", 28)));
    }

    public List<Employees> getEmployees() {
        return employees;
    }
}
