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

        fullTimeEmployee1.setEmployeeIdNum(1);
        fullTimeEmployee2.setEmployeeIdNum(2);
        fullTimeEmployee3.setEmployeeIdNum(3);
        contractor1.setEmployeeIdNum(1);
        contractor2.setEmployeeIdNum(2);
        contractor3.setEmployeeIdNum(3);


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
            long salary = employee.salary();
            totalSalary = totalSalary + salary;
        }

        System.out.println("Total salary is $" + totalSalary + ".");
    }
}
