package lab_08_1;

public class Employee {

    private String employeeId;
    private long salary;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public long getSalary() {
        return salary;
    }
}