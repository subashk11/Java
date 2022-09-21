package com.java;
import java.util.Scanner;
public class Strings_Example {
    public static void main(String[] args) {
        String name="Tom";
        //.length() is used to know the length of the string.
        System.out.println("The length of the name is "+name+" "+name.length() );

        //To upper case:
        System.out.println("\n Enter the string which need to change to upper case :");
        Scanner sc=new Scanner(System.in);
        String character=sc.next();
        System.out.println("The final String is : "+character.toUpperCase( ));

        //change to lowercase
        //To upper case:
        System.out.println("\n Enter the string which need to change to Lower case :");
        String new_str=sc.next();
        System.out.println("The final String is : "+new_str.toLowerCase( ));

        //Index
        String str="Hello Everyone! this is a Pleasant Morning.";
        System.out.println(str.indexOf("Pleasant"));

        //Concatenation
        String firstName="Peter";
        String lastName="Parker";
        System.out.println(firstName.concat(lastName));

        //To use " " inside a print statement use \ before it
        System.out.println("This way \" Heros \" Save our planet aren\'t they");
    }
}
