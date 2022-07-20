package lab_10;

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

    int animalMaxSpeed = 50;
    int randomSpeed = new SecureRandom().nextInt(animalMaxSpeed);
    @Override
    public int speed() {
        return randomSpeed;
    }

    @Override
    public String toString() {
        return "{" + "animalType='" + getAnimalType() + '\'' +
                " ,speed=" + speed() + '}' + '\n';
    }
}