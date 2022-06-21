package lab_08_2;

import java.security.SecureRandom;

public class Horse extends Animal {

    @Override
    public String getAnimalType() {
        String animalName = super.getAnimalType();
        if (animalName == null) {
            return "Horse";
        } else {
            return "Horse" + animalName;
        }
    }

    @Override
    public int getMaxSpeed() {
        return 70;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalType='" + getAnimalType() + '\'' +
                super.toString() +
                '}'+ '\n';
    }
}
