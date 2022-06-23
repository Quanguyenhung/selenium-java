package lab_08_1;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee fullTimeEmployee1 = new FullTimeEmployee("01");
        Employee fullTimeEmployee2 = new FullTimeEmployee("02");
        Employee contractor1 = new Contractor("01");
        Employee contractor2 = new Contractor("02");


        List<Employee> employeeList = Arrays.asList(fullTimeEmployee1,fullTimeEmployee2,
                contractor1,contractor2);

        System.out.println(employeeList);
        System.out.println("Total salary is $" + salaryCalculation(employeeList) + ".");
    }

    private static long salaryCalculation(List<Employee> employeeList) {
        long totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
}