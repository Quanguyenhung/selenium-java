package lab_08_1;

public class Contractor extends Employee {

    @Override
    public long salary() {
        return 10;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "Id Number= C" + getEmployeeIdNum() +
                ", salary= " + salary() +
                '}';
    }
}
