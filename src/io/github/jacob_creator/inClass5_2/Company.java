package io.github.jacob_creator.inClass5_2;

public class Company {
    private final String name;
    private Employee[] employees;
    public Company(String name, Employee[] employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    //just because there could potentially be a null value for an employee.
    public int getEmployeeCount() {
        int count = 0;
        for (Employee employee : employees) {
            if(employee != null)
                count++;
        }
        return count;
    }
}
