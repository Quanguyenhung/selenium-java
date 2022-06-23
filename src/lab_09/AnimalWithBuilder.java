package lab_09;

import java.security.SecureRandom;

public class AnimalWithBuilder {

    private String animalType;
    private int speed;
    private boolean canFly;

    protected AnimalWithBuilder(Builder builder){
        this.animalType = builder.animalType;
        this.speed = builder.speed;
        this.canFly = builder.canFly;
    }

    public String getAnimalType() {
        return animalType;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isCanFly() {
        return canFly;
    }

    @Override
    public String toString() {
        return "AnimalWithBuilder{" +
                "animalType='" + animalType + '\'' +
                ", speed=" + speed +
                ", canFly=" + canFly +
                '}' + '\n';
    }

    //Inner class
    public static class Builder {

        private String animalType;
        private int speed;
        private boolean canFly;

        public Builder setAnimalType(String animalType) {
            this.animalType = animalType;
            return this;
        }

        //Set speed yourself
//        public Builder setSpeed(int speed) {
//            this.speed = speed;
//            return this;
//        }

        //Set random speed
        public Builder setSpeed(int maxSpeed) {
            this.speed = new SecureRandom().nextInt(maxSpeed);
            return this;
        }

        public Builder setCanFly(boolean canFly) {
            this.canFly = canFly;
            return this;
        }

        public AnimalWithBuilder build() {
            return new AnimalWithBuilder(this);
        }
    }
}