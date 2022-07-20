package lab_08_2;

import java.security.SecureRandom;

public class Animal {

    private String animalType;
    private int speed;

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalType() {
        return animalType;
    }

    public int getSpeed() {
        return speed;
    }

    public int setSpeed(int maxSpeed) {
        this.speed = new SecureRandom().nextInt(maxSpeed);
        return speed;
    }
}