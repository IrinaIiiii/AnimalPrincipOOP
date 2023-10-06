package com.company;

public class Dog extends Animal {
    @Override
     public void makeNoise () {
        System.out.println("Гав-Гав");
    }
    @Override
    public void eat () {
        System.out.println("Есть еду для собак");
    }
    @Override
    public void getDescription () {
        System.out.println("Собаку зовут "+name );
    }
}
