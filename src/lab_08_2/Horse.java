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

    int animalMaxSpeed = 50;
    int randomSpeed = super.setSpeed(animalMaxSpeed);
    @Override
    public int getSpeed() {
        return randomSpeed;
    }

    @Override
    public String toString() {
        return "{" + "animalType='" + getAnimalType() + '\'' +
                " ,speed=" + getSpeed() + '}'+ '\n';
    }
}
