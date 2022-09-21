package com.java;

public class Operators {

    public static void main(String[] args) {
	// write your code here
        System.out.println("These are some examples of arithmetic operators : ");

        int a=20,b=30;
        //Addition
        int c=a+b; //'+' is used for addition/sum
        System.out.println("The addition of a and b is : " +c);

        //Subraction
        int s=a+b; //'+' is used for sub
        System.out.println("The subraction of a and b is : " +s);

        //Multiplication
        int m=a*b; //'*' is used for Mul
        System.out.println("The mul of a and b is : " +m);

        //Division
        int d=a+b; //'+' is used for div
        System.out.println("The div of a and b is : " +d);

        //Modulo
        int mod=a%b; //'+' is used for mod
        System.out.println("The modulo of a and b is : " +mod+"\n");


        //Comparison operators
        int x=10,y=20;
        //equal to
        if(x==y)
        {
            System.out.println("X is equal to y ");
        }
        //lesser than or equal to
        if (x<=y)
        {
            System.out.println("X is lesser than or equal to y");
        }
        //greater than or equal to
        if(x>=y)
        {
            System.out.println("X is greater than or equal to y");
        }
        //not equal to
        if(x!=y)
        {
            System.out.println("X is not equal to y \n");
        }
        //Logical operators

        //And- &&
        if(8>6 && 3!=4)
        {
            System.out.println("Both the condition are true the resultis true in AND operator : "+(8>6 && 3!=4));
        }
        //OR-||
        if(0>10 || 4<24)
        {
            System.out.println("If any one of the condition is true the resultis true in OR operator : "+(0>10 || 4<24));
        }

        //Not - !
        //reverse the resulr if the result is true return false
        System.out.println("Reverse the result if true comes reverse it as false :" +(!(8>6 && 3!=4)));
    }
}
