package lab_08_2;

import java.security.SecureRandom;

public class Tiger extends Animal {

    @Override
    public String getAnimalType() {
        String animalName = super.getAnimalType();
        if (animalName == null) {
            return "Tiger";
        } else {
            return "Tiger" + animalName;
        }
    }

    @Override
    public int getMaxSpeed() {
        return 60;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalType='" + getAnimalType() + '\'' +
                super.toString() +
                '}'+ '\n';
    }
}
