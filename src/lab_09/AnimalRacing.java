package lab_09;

import java.util.ArrayList;
import java.util.List;

import static lab_09.AnimalWithBuilder.Builder;

public class AnimalRacing {

    public static void main(String[] args) {

        Builder animal = new Builder();

        AnimalWithBuilder eagle = animal
                .setAnimalType("Eagle")
                .setSpeed(50)
                .setCanFly(true).build();

        AnimalWithBuilder falcon = animal
                .setAnimalType("Falcon")
                .setSpeed(60)
                .setCanFly(true).build();

        AnimalWithBuilder cat = animal
                .setAnimalType("Cat")
                .setSpeed(30)
                .setCanFly(false).build();

        AnimalWithBuilder snake = animal
                .setAnimalType("Snake")
                .setSpeed(30)
                .setCanFly(false).build();

        AnimalWithBuilder lion = animal
                .setAnimalType("Lion")
                .setSpeed(20)
                .setCanFly(false).build();

        List<AnimalWithBuilder> animalWithBuilderList = new ArrayList<>();
        animalWithBuilderList.add(eagle);
        animalWithBuilderList.add(cat);
        animalWithBuilderList.add(snake);
        animalWithBuilderList.add(falcon);
        animalWithBuilderList.add(lion);

        //Remove animals that can fly.
        for (int index = 0; index < animalWithBuilderList.size(); index++) {
            boolean canFly = animalWithBuilderList.get(index).isCanFly();
            if (canFly) {
                animalWithBuilderList.remove(index);
                index--;
            }
        }

        System.out.println(animalWithBuilderList);

        findFastestAnimal(animalWithBuilderList);
    }

    private static int findMaxSpeed (List<AnimalWithBuilder> animalList) {
        int maxSpeed = animalList.get(0).getSpeed();
        for (AnimalWithBuilder animalWithBuilder : animalList) {
            int speed = animalWithBuilder.getSpeed();
            if (maxSpeed < speed) {
                maxSpeed = speed;
            }
        }

        return maxSpeed;
    }

    private static void findFastestAnimal (List<AnimalWithBuilder> animalList){

        int maxSpeed = findMaxSpeed(animalList);

        for (int index = 0; index < animalList.size(); index++) {
            int speed = animalList.get(index).getSpeed();
            if (maxSpeed != speed) {
                animalList.remove(index);
                index--;
            }
        }

        if (animalList.size() > 1) {
            System.out.print("The winners are " + animalList);
        } else {
            System.out.println("The winner is " + animalList);
        }
    }
}