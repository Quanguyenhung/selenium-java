package lab_08_2;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class AnimalRacing {

    public static void main(String[] args) {

        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();

        horse.setSpeed(randomSpeed(horse.getMaxSpeed()));
        tiger.setSpeed(randomSpeed(tiger.getMaxSpeed()));
        dog.setSpeed(randomSpeed(dog.getMaxSpeed()));

        List<Animal> animalList = new ArrayList<>();
        animalList.add(horse);
        animalList.add(tiger);
        animalList.add(dog);

        System.out.println(animalList);

        int maxSpeed = animalList.get(0).getSpeed();
        int indexMax1 = 0;
        int indexMax2 = 0;

        for (int index = 0; index < animalList.size(); index++) {
            int speed = animalList.get(index).getSpeed();
            if (maxSpeed < speed) {
                maxSpeed = speed;
                indexMax1 = index;
            }
        }

        for (int index = 0; index < animalList.size(); index++) {
            int speed = animalList.get(index).getSpeed();
            if (maxSpeed == speed) {
                indexMax2 = index;
            }
        }

        if (indexMax1 != indexMax2) {
            System.out.println("The winners are " + animalList.get(indexMax1).getAnimalType() +
                    " with the speed of " + maxSpeed + "km/h, and " +
                    animalList.get(indexMax2).getAnimalType() +
                    " with the speed of " + maxSpeed + "km/h.");
        } else {
            System.out.println("The winner is " + animalList.get(indexMax1).getAnimalType() +
                    " with the speed of " + maxSpeed + "km/h.");
        }
    }

    private static int randomSpeed(int maxSpeed) {
        return new SecureRandom().nextInt(maxSpeed);
    }
}
