package Wildcards_Generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));
        test(listOfAnimal);

        List<Dogs> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dogs(3));
        listOfDogs.add(new Dogs(4));
        test(listOfDogs);
    }

    private static void test(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }
}

