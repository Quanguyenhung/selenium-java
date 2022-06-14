package lab_08_1;

public class FullTimeEmployee extends Employee {

    @Override
    public long salary() {
        return 20;
    }

    @Override
    public String toString() {
        return "Full Time Employee{" +
                "Id Number= F" + getEmployeeIdNum() +
                ", salary= " + salary() +
                '}' + "\n" ;
    }
}
