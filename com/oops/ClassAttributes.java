package com.oops;

//Creating a class with multiple attributes.

class Main{
    int x=10,y=100;
    String s1="Hello",s2="World";
}
public class ClassAttributes {
    public static void main(String[] args) {
        //Creating mutliple object for the class(Main)
        Main obj1=new Main();
        Main obj2=new Main();

        //Modify an attributes.
        obj1.x=240;
        int sum=obj1.x+ obj2.y;
        System.out.println("The sum of the numbers is "+ sum);

        //Calling the String attributes
        System.out.println(obj2.s1+" "+obj2.s2);
    }
}
