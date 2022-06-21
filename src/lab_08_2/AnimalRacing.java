package lab_08_2;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class AnimalRacing {

    public static void main(String[] args) {

        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog1 = new Dog();
        Animal dog2 = new Dog();

//        dog1.setSpeed(randomSpeed(dog1.getMaxSpeed()));
//        horse.setSpeed(randomSpeed(horse.getMaxSpeed()));
//        tiger.setSpeed(randomSpeed(tiger.getMaxSpeed()));

        dog1.setSpeed(5);
        dog2.setSpeed(6);
        horse.setSpeed(6);
        tiger.setSpeed(5);
        dog1.setAnimalType("1");
        dog2.setAnimalType("2");

        List<Animal> animalList = new ArrayList<>();
        animalList.add(horse);
        animalList.add(tiger);
        animalList.add(dog1);
        animalList.add(dog2);

        System.out.println(animalList);

        findFastestAnimal(animalList);
    }

    private static int randomSpeed(int maxSpeed) {
        return new SecureRandom().nextInt(maxSpeed);
    }

    private static int findMaxSpeed(List<Animal> animalList) {
        int maxSpeed = animalList.get(0).getSpeed();
        for (Animal animal : animalList) {
            int speed = animal.getSpeed();
            if (maxSpeed < speed) {
                maxSpeed = speed;
            }
        }

        return maxSpeed;
    }

    private static void findFastestAnimal(List<Animal> animalList) {

        int maxSpeed = findMaxSpeed(animalList);

        for (int index = 0; index < animalList.size(); index++) {
            int speed = animalList.get(index).getSpeed();
            if (maxSpeed != speed) {
                animalList.remove(index);
                index--;
            }
        }

        if (animalList.size() > 1) {
            System.out.print("The winners are ");
            for (Animal animal : animalList) {
                System.out.print(animal.getAnimalType() + ", ");
            }
            System.out.printf("with the speed of %dkm/k.", maxSpeed);
        } else {
            System.out.println("The winner is " + animalList.get(0).getAnimalType() +
                    " with the speed of " + maxSpeed + "km/k.");
        }
    }

}
