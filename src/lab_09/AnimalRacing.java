package lab_09;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import static lab_09.AnimalWithBuilder.AnimalBuilder;

public class AnimalRacing {

    public static void main(String[] args) {

        AnimalBuilder animal = new AnimalBuilder();
        animal.setAnimalType("Eagle");
        animal.setSpeed(randomSpeed(40));
        animal.setCanFly(true);
        AnimalWithBuilder eagle = animal.build();

        animal.setAnimalType("Falcon");
        animal.setSpeed(randomSpeed(50));
        animal.setCanFly(true);
        AnimalWithBuilder falcon = animal.build();

        animal.setAnimalType("Cat");
        animal.setSpeed(randomSpeed(30));
        animal.setCanFly(false);
        AnimalWithBuilder cat = animal.build();

        animal.setAnimalType("Snake");
        animal.setSpeed(randomSpeed(20));
        animal.setCanFly(true);
        AnimalWithBuilder snake = animal.build();

        List<AnimalWithBuilder> animalWithBuilderList = new ArrayList<>();
        animalWithBuilderList.add(eagle);
        animalWithBuilderList.add(cat);
        animalWithBuilderList.add(snake);
        animalWithBuilderList.add(falcon);

        System.out.println(animalWithBuilderList);

        //Filter: to remove animals that can fly.
        for (int index = 0; index < animalWithBuilderList.size(); index++) {
            boolean canFly = animalWithBuilderList.get(index).isCanFly();
            if (canFly) {
                animalWithBuilderList.remove(index);
                index--;
            }
        }

        int animalListSize = animalWithBuilderList.size();
        int maxSpeed = animalWithBuilderList.get(0).getSpeed();
        int indexMax1 = 0;
        for (int index = 0; index < animalListSize; index++) {
            int speed = animalWithBuilderList.get(index).getSpeed();
            if (maxSpeed < speed) {
                maxSpeed = speed;
                indexMax1 = index;
            }
        }

        int indexMax2 = 0;
        for (int index = 0; index < animalListSize; index++) {
            int speed = animalWithBuilderList.get(index).getSpeed();
            if (maxSpeed == speed) {
                indexMax2 = index;
            }
        }

        if (indexMax1 != indexMax2) {
            System.out.println("The winners are " + animalWithBuilderList.get(indexMax1).getAnimalType() +
                    " with the speed of " + maxSpeed + "km/h, and " +
                    animalWithBuilderList.get(indexMax2).getAnimalType() +
                    " with the speed of " + maxSpeed + "km/h.");
        } else {
            System.out.println("The winner is " + animalWithBuilderList.get(indexMax1).getAnimalType() +
                    " with the speed of " + maxSpeed + "km/h.");
        }
    }

    private static int randomSpeed(int maxSpeed) {
        return new SecureRandom().nextInt(maxSpeed);
    }
}
