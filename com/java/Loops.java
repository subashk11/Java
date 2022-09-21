package com.java;
public class Loops {
    public static void main(String[] args) {
        //1.if..else loops
        int x=20;
        if(x>20)
        {
            System.out.println("x is greater than 20");
        }
        else if(x<20)
        {
            System.out.println("x is lesser than 20");
        }
        else if (x==20)
        {
            System.out.println("x is equal to 20");
        }
        else{
            System.out.println("error");
        }

        //ternary operator in if_else loop
        String res=(x==20) ? "x is equal to 20" : "x is not equal to 20";
        System.out.println(res);

        //2.Switch loops
        System.out.println("\nSwitch loops:");

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
        }

        //3.While Loops
        System.out.println("\nWhile Loops:");
        int i=0;
        while(i<=10)
        {
            System.out.println(i+"* 10 ="+i*10);
            i++;
        }

        //For loops
        System.out.println("\nFor loops:");
        for(int num=90;num>=80;num--)
        {
            System.out.println(num);
        }

        //For each loop
        System.out.println("For-each loop");
        int[] numbers={1,2,3,4,5,6};
        for(int l:numbers)
        {
            System.out.println(l);
        }

        //5.Break and continue loops
        System.out.println("\nBreak and continue loops:");

        //Break
        System.out.println("Break");
        for (int k=0;k<10;k++)
        {
            if (k==4)
            {
                break;
            }
            System.out.println(k);
        }

        //Continue
        System.out.println("\nContinue");
        for (int k=0;k<10;k++)
        {
            if (k==4)
            {
                //leave the current found item and moves to the next item
                continue;
            }
            System.out.println(k);
        }
    }
}
