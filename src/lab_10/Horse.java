package lab_10;

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

    int animalMaxSpeed = 75;
    int randomSpeed = new SecureRandom().nextInt(animalMaxSpeed);
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
