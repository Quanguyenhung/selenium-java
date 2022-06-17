package lab_08_1;

public class Contractor extends Employee {

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