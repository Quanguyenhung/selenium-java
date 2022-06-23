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

    int randomSpeed = new SecureRandom().nextInt(50);
    @Override
    public int speed() {
        return randomSpeed;
    }

    @Override
    public String toString() {
        return "{" + "animalType='" + getAnimalType() + '\'' +
                " ,speed=" + speed() + '}'+ '\n';
    }
}