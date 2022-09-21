package com.oops;

class animalSound{
    public void sound(){
        System.out.println("Animals make different sounds");
    }
}

class  Dog extends animalSound{
    public void sound(){
        System.out.println("Dog barks: Bow! Bow!");
    }
}

class Cat extends animalSound{
    public void sound(){
        System.out.println("Cat makes Mewo! Mewo!");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        animalSound obj1=new animalSound();
        animalSound obj2= new Cat();
        animalSound obj3=new Dog();

        obj1.sound();
        obj2.sound();
        obj3.sound();
    }
}
