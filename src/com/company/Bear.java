package com.company;

public class Bear extends Animal {
    @Override
    public void makeNoise () {
        System.out.println("Буууу");
    }
    @Override
    public void eat () {
        System.out.println("Ест еду съедобную для медведей");
    }
    @Override
    public void getDescription () {
        System.out.println("Медведя зовут "+name );
    }
}
