package com.oops;


public class ClassMethods {
    //static vs non-static methods
    static  void myMethod()
    {
        System.out.println("Static method can be called without creating an object for it");
    }

    //non-static
    public void newMethod()
    {
        System.out.println("non-static methods can be called only by creating an object for it");
    }

    public static void main(String[] args) {
        myMethod(); //static method

        ClassMethods obj1=new ClassMethods();
        obj1.newMethod();  //non-static
    }
}
