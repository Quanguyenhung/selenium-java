package lab_08_1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

    public static void main(String[] args) {

        Employee fullTimeEmployee1 = new FullTimeEmployee();
        Employee fullTimeEmployee2 = new FullTimeEmployee();
        Employee fullTimeEmployee3 = new FullTimeEmployee();
        Employee contractor1 = new Contractor();
        Employee contractor2 = new Contractor();
        Employee contractor3 = new Contractor();

        fullTimeEmployee1.setEmployeeId("01");
        fullTimeEmployee2.setEmployeeId("02");
        fullTimeEmployee3.setEmployeeId("03");
        contractor1.setEmployeeId("01");
        contractor2.setEmployeeId("02");
        contractor3.setEmployeeId("03");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(fullTimeEmployee1);
        employeeList.add(fullTimeEmployee2);
        employeeList.add(fullTimeEmployee3);
        employeeList.add(contractor1);
        employeeList.add(contractor2);
        employeeList.add(contractor3);

        System.out.println(employeeList);

        long totalSalary = 0;
        for (Employee employee : employeeList) {
            long salary = employee.getSalary();
            totalSalary = totalSalary + salary;
        }

        System.out.println("Total salary is $" + totalSalary + ".");
    }
}