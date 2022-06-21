package lab_08_2;

import java.security.SecureRandom;

public class Dog extends Animal {

    @Override
    public String getAnimalType() {
        String animalName = super.getAnimalType();
        if (animalName == null) {
            return "Dog";
        } else {
            return "Dog" + animalName;
        }
    }

    @Override
    public int getMaxSpeed() {
        return 50;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalType='" + getAnimalType() + '\'' +
                super.toString() +
                '}' + '\n';
    }
}
