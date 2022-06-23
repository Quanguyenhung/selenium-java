package lab_10;

public abstract class Animal {

    private String animalType;
    public abstract int speed();

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalType() {
        return animalType;
    }
}