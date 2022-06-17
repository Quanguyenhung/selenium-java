package lab_08_1;

public class FullTimeEmployee extends Employee {

    @Override
    public long getSalary() {
        return 20;
    }

    @Override
    public String getEmployeeId() {
        return "F" + super.getEmployeeId();
    }

    @Override
    public String toString() {
        return "Full Time Employee{" +
                "Id= " + getEmployeeId() +
                ", salary= $" + getSalary() +
                '}' + "\n" ;
    }
}