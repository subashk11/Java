package com.java;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        System.out.println("Enter the two numbers : ");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("The sum of the two numbers is : "+ c);
    }
}
