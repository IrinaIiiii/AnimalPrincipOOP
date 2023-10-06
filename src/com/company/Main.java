package com.company;

public class Main {

    public static void main(String[] args) {
	Animal[] animals=new Animal[1000];
    Animal dog1=new Dog();
    Animal cat1=new Cat();
    Animal bear1=new Bear();
    dog1.name="Барсик";
    cat1.name="Муся";
    bear1.name="Толстый";
    animals[0]=dog1;
    animals[1]=cat1;
    animals[2]=bear1;
    Veterenar veterenar=new Veterenar();
     for (int x=0; x<animals.length;x++) {
         if (animals[x]==null) {
             break;
         }
        veterenar.treatAnimal(animals[x]);
    }
    }
}
