package lab_08_1;

public class Employee {

    private String employeeId;
    private long salary;

    public Employee() {
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Employee Id= " + employeeId +
                ", salary= $" + getSalary() +
                '}';
    }
}