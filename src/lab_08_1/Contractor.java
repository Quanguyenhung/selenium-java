package lab_08_1;

public class Contractor extends Employee {

    public Contractor(String employeeId) {
        super(employeeId);
    }

    @Override
    public long getSalary() {
        return 10;
    }

    @Override
    public String getEmployeeId() {
        return "C" + super.getEmployeeId();
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "Id= " + getEmployeeId() +
                ", salary= $" + getSalary() +
                '}' + "\n";
    }
}