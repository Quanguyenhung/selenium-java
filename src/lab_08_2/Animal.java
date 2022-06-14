package lab_08_2;

import java.security.SecureRandom;

public abstract class Animal {

    private String animalType;
    private int speed;
    private int maxSpeed;

    public Animal() {
    }

    public Animal(String animalType, int speed, int maxSpeed) {
        this.animalType = animalType;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }

    public Animal(String animalType, int randomSpeed) {
        this.animalType = animalType;
        this.speed = randomSpeed;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed ;
    }

    public int maxSpeed(){
        return maxSpeed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return ", speed=" + speed ;
    }
}
