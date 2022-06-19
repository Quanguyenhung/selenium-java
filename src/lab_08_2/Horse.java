package lab_08_2;

public class Horse extends Animal {

    @Override
    public String getAnimalType() {
        return "Horse";
    }

    @Override
    public int getAnimalMaxSpeed() {
        return 75;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalType='" + getAnimalType() + '\'' +
                super.toString() +
                ", maxSpeed=" + getAnimalMaxSpeed() +
                '}' + "\n";
    }
}
