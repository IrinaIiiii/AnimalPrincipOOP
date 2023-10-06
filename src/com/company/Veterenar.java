package com.company;

public class Veterenar {
    public void treatAnimal (Animal animal) {
        System.out.println("Животное пришло на прием к ветеринару");
        animal.getDescription();
        animal.makeNoise();
        animal.eat();
            }
}
