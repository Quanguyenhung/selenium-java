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

    int animalMaxSpeed = 100;
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
