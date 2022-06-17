package lab_08_2;

public class Tiger extends Animal {

    @Override
    public String getAnimalType() {
        return "Tiger";
    }

    @Override
    public int getMaxSpeed() {
        return 100;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalType='" + getAnimalType() + '\'' +
                super.toString() +
                ", maxSpeed=" + getMaxSpeed() +
                '}' + "\n";
    }
}
