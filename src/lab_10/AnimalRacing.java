package lab_10;

import java.util.ArrayList;
import java.util.List;

public class AnimalRacing {

    public static void main(String[] args) {

        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog1 = new Dog();
        Animal dog2 = new Dog();

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

    //Controllers
    private static int findMaxSpeed(List<Animal> animalList) {
        int maxSpeed = animalList.get(0).speed();
        for (Animal animal : animalList) {
            int speed = animal.speed();
            if (maxSpeed < speed) {
                maxSpeed = speed;
            }
        }
        return maxSpeed;
    }

    private static void findFastestAnimal(List<Animal> animalList) {

        int maxSpeed = findMaxSpeed(animalList);

        //Remove animals that don't run with max speed from animalList
        for (int index = 0; index < animalList.size(); index++) {
            int speed = animalList.get(index).speed();
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
