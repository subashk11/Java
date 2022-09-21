package com.oops;

//Parent class
class carName{
    protected String brandName="Ford";
    protected String brandName1="BENZ";

    public void topSpeed(int speed){
        System.out.println("The car is driving at a speed of : "+speed +"Km/h");
    }
}
//Extends: Used to inherit the attributes of the parent class
public class Inheritance extends carName{
    String modelName1="Mustang";
    String modelName2="S class";
    public static void main(String[] args) {
        Inheritance obj1=new Inheritance();
        System.out.println("The car brand is "+obj1.brandName+" model name is "+obj1.modelName1);
        obj1.topSpeed(240);

        System.out.println("\nThe car brand is "+obj1.brandName1+" model name is "+obj1.modelName2);
        obj1.topSpeed(200);
    }
}
