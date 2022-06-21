package lab_08_2;

public abstract class Animal {

    private String animalType;
    private int speed;
    private int maxSpeed;

    public Animal() {
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getAnimalType() {
        return animalType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return ", speed=" + speed ;
    }
}
