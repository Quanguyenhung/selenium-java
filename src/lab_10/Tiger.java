package lab_10;

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

    int randomSpeed = new SecureRandom().nextInt(20);
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