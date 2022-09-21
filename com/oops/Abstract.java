package com.oops;
import java.util.Scanner;

abstract class  newOne{
    int x;
    int y;
    abstract int sum(int x,int y);
}

class Sum extends newOne{
    @Override
    int sum(int x,int y) {
        return x+y;
    }
    //final
    final int num=200;
}
public class Abstract {
    public static void main(String[] args) {
        System.out.println("enter the two numbers : ");
        Scanner sc= new Scanner(System.in);

        Sum obj=new Sum();
        obj.x=sc.nextInt();
        obj.y=sc.nextInt();

        System.out.println("The sum of the numbers is : "+obj.x+"+"+obj.y+"= "+obj.sum(obj.x, obj.y));

        //final: values cannot be changed once declared and initalized.
        //obj.num=21;   --- Throws an error.
    }
}
