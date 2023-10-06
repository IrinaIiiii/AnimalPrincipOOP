package com.company;

public class Cat extends Animal {
    @Override
    public void makeNoise () {
        System.out.println("Мяу");
    }
    @Override
    public void eat () {
        System.out.println("Есть еду для кошек");
    }
    @Override
    public void getDescription () {
        System.out.println("Кошку зовут "+name );
    }
}
