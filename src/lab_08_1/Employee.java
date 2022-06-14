package lab_08_1;

public class Employee {

    private int employeeIdNum;

    public Employee() {
    }

    public Employee(int employeeIdNum) {
        this.employeeIdNum = employeeIdNum;
    }

    public int getEmployeeIdNum() {
        return employeeIdNum;
    }

    public void setEmployeeIdNum(int employeeIdNum) {
        this.employeeIdNum = employeeIdNum;
    }

    public long salary() {
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Employee Id Number= " + employeeIdNum +
                ", salary= " + salary() +
                '}';
    }
}
