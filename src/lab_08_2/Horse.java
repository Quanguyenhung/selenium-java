package lab_08_2;

public class Horse extends Animal {

    @Override
    public String getAnimalType() {
        return "Horse";
    }

    @Override
    public int getMaxSpeed() {
        return 1;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalType='" + getAnimalType() + '\'' +
                super.toString() + '\'' +
                ", maxSpeed=" + getMaxSpeed() +
                '}' + "\n";
    }
}
