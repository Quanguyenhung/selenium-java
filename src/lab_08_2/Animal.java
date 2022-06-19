package lab_08_2;

public abstract class Animal {

    private String animalType;
    private int speed;
    private int animalMaxSpeed;

    public Animal() {
    }

    public Animal(String animalType, int speed, int maxSpeed) {
        this.animalType = animalType;
        this.speed = speed;
        this.animalMaxSpeed = maxSpeed;
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

    public int getAnimalMaxSpeed() {
        return animalMaxSpeed;
    }

    public void setAnimalMaxSpeed(int animalMaxSpeed) {
        this.animalMaxSpeed = animalMaxSpeed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return ", speed=" + speed ;
    }
}
