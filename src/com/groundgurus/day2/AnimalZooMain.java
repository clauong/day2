package com.groundgurus.day2;

import java.util.Arrays;

/**
 *
 * @author ongsa
 */
public class AnimalZooMain {

    public static void main(String[] args) {
        AnimalZoo mnlZoo
                = new AnimalZoo(
                        Arrays.asList(
                                new Dog(),
                                new Dog(),
                                new Dog(),
                                new Cat(),
                                new Cat()
                        ));

        mnlZoo.walkAllAnimals();
    }
}
