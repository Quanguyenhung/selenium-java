package lab_09;

import java.util.ArrayList;
import java.util.List;

import static lab_09.AnimalWithBuilder.Builder;

public class AnimalRacing {

    public static void main(String[] args) {

        Builder animal = new Builder();

        AnimalWithBuilder eagle = animal.setAnimalType("Eagle").setSpeed(50).setCanFly(true).build();
        AnimalWithBuilder falcon = animal.setAnimalType("Falcon").setSpeed(60).setCanFly(true).build();
        AnimalWithBuilder cat = animal.setAnimalType("Cat").setSpeed(30).setCanFly(false).build();
        AnimalWithBuilder snake = animal.setAnimalType("Snake").setSpeed(30).setCanFly(false).build();
        AnimalWithBuilder lion = animal.setAnimalType("Lion").setSpeed(20).setCanFly(false).build();

        List<AnimalWithBuilder> animalList = new ArrayList<>();
        animalList.add(eagle);
        animalList.add(cat);
        animalList.add(snake);
        animalList.add(falcon);
        animalList.add(lion);

        System.out.println(animalList);
        List<AnimalWithBuilder> racingList = removeCanFlyAnimal(animalList);
        System.out.println(racingList);

        findFastestAnimal(racingList);
    }

    //Controllers
    private static int findMaxSpeed(List<AnimalWithBuilder> animalList) {
        int maxSpeed = animalList.get(0).getSpeed();
        for (AnimalWithBuilder animalWithBuilder : animalList) {
            int speed = animalWithBuilder.getSpeed();
            if (maxSpeed < speed) {
                maxSpeed = speed;
            }
        }
        return maxSpeed;
    }

    private static List<AnimalWithBuilder> removeCanFlyAnimal(List<AnimalWithBuilder> animalWithBuilderList) {
        for (int index = 0; index < animalWithBuilderList.size(); index++) {
            boolean canFly = animalWithBuilderList.get(index).isCanFly();
            if (canFly) {
                animalWithBuilderList.remove(index);
                index--;
            }
        }
        return animalWithBuilderList;
    }

    private static void findFastestAnimal(List<AnimalWithBuilder> animalList) {

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
            for (AnimalWithBuilder animal : animalList) {
                System.out.print(animal.getAnimalType() + ", ");
            }
            System.out.printf("with the speed of %dkm/k.", maxSpeed);
        } else {
            System.out.println("The winner is " + animalList.get(0).getAnimalType() +
                    " with the speed of " + maxSpeed + "km/k.");
        }
    }
}