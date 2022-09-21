package com.java;

public class Methods {
    //Methods are a set of code which can we used when ever needed.

    //syntax of a methods.

    //Initialize a method.
    static void myMethod(){
        System.out.println("I got executed!");
    }

    //Methods with parameters.
    static  void myName(String name)
    {
        System.out.println("My name is : "+name);
    }

    //Multiple parameters
    //Methods with return value.
    static  int sum(int num1,int num2)
    {
        int c=num1+num2;
        return c;
    }

    //Method Overloading.
    static int mySum(int a,int b){
        return a+b;
    }

    static float mySum(float a,float b){
        return a+b;
    }

    static double mySum(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
	    // write your code here
        System.out.println("Methods : \n");
        //Call a method.
        myMethod();
        myMethod();
        myMethod();

        //Methods with parameters:
        myName("Subash");

        //Methods with return value:
        int add=sum(10,20);
        System.out.println("The sum of the numbers is :"+add);

        //Method overloading.
        System.out.println("This function calls the integer method: "+mySum(10,20));
        System.out.println("This function calls the float method: "+mySum(34.34f,43.21f));
        System.out.println("This function calls the double method: "+mySum(1123.897d,20345.5678d));
    }
}
