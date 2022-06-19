package lab_09;

public class AnimalWithBuilder {

    private String animalType;
    private int speed;
    private boolean canFly;

    protected AnimalWithBuilder(AnimalBuilder builder){
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

    public static class AnimalBuilder {

        private String animalType;
        private int speed;
        private boolean canFly;

        public void setAnimalType(String animalType) {
            this.animalType = animalType;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public void setCanFly(boolean canFly) {
            this.canFly = canFly;
        }

        public AnimalWithBuilder build() {
            return new AnimalWithBuilder(this);
        }
    }
}