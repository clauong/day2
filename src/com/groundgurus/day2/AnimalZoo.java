package com.groundgurus.day2;

import java.util.List;

/**
 *
 * @author ongsa
 */
public class AnimalZoo {

    private List<Animal> animals;

    public AnimalZoo(List<Animal> animals) {
        this.animals = animals;
    }

    public void walkAllAnimals() {
        for (Animal animal : animals) {
            walkAnimal(animal);
        }
    }

    public void walkAnimal(Animal animal) {
        animal.walk();
    }

    //too specific
    /*public void walkDog(Dog dog) {
        dog.walk();
    }

    public void walkCat(Cat cat) {
        cat.walk();
    }*/
}
