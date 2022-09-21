package com.java;
import java.util.Scanner;


public class TypeCasting {
    public static void main(String[] args) {
        //Type casting
        //1.Widening casting:Automatically converts one data type to another

        //Automatic casting: int to float.
        Scanner sc=new Scanner(System.in);
        //Here we are entering a integer number but the compiler automatically converts it to a float type.
        float num=sc.nextInt();
        System.out.println(num);

        //Automatic casting : int to double:
        System.out.println("enter a integer number ; ");
        double num1=sc.nextDouble();
        System.out.println(num1);

        //2.Narrow casting:Manually convert one data type to another
        //Casting:Float to double.
        float c=123.45f;
        int a=(int)(c);
        System.out.println("Coversion of float number : "+c+" coverted to integer : "+a);

        //Casting: Double to int.
        double m= 456.567_53d;
        int b=(int)m;
        System.out.println("Coversion of double number : "+m+" coverted to integer : "+b);

        //byte data type cannot store values more than 256.
        int n=257;
        //Typecasting integer to byte.
        byte d=(byte)n;//byte divides 256 by the number given ie.257/256 adn returns the reaminder of it.
        System.out.println("Coversion of int number : "+n+" coverted to byte : "+d);

    }
}
