package io.github.jacob_creator.inClass5_2;

import java.text.DecimalFormat;

public class Driver {

    private static final DecimalFormat decimalFormat = new DecimalFormat("##,###");

    public static void main(String[] args) {
        Company company = new Company(
                "GameStop",
                new Employee[]{
                        new Employee("Nate", GenderTypes.MALE, JobTypes.SOFTWARE_DEVELOPER),
                        new Employee("Gold", GenderTypes.FEMALE, JobTypes.TECHNOLOGY_SUPPORT),
                        new Employee("Lollero", GenderTypes.OTHER, JobTypes.SYSTEM_ADMINISTRATOR),
                        new Employee("Austin", GenderTypes.MALE, JobTypes.GENERAL_MANAGER),
                        new Employee("Nick", GenderTypes.MALE, JobTypes.SOFTWARE_DEVELOPER)
                }
        );

        System.out.println(company.getName() + " Employees (" + company.getEmployeeCount() + " total)");
        for (Employee employee : company.getEmployees()) {
            System.out.println("\t" + employee.getName() + " (" + employee.getGender().getReadableName() + ") - " + employee.getJob().getName() + " $" + decimalFormat.format(employee.getJob().getSalary(employee.getGender())) + "/year"  );
        }
    }
}
