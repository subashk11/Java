package Strings;

public class Strings {
    public static void main(String[] args) {

        //Syntax for create a String variable

        String name="Subash";
        System.out.println(name+" "+name.getClass().getName());

        //Strings are immutable the objects cannot be modified once declared

        //To know the length of the string
        System.out.println("The length of the string is : "+name.length());

        //If we want a specific sub string from a string
        System.out.println("The use of substring : "+name.substring(3,6));
        //when we need to print from a point to the end of the string
        System.out.println("The use of substring : "+name.substring(3));

        //To find a particular character at the given position.
        //The return type is a character not a string.
        System.out.println("The character at the position 4 in the string is : "+ name.charAt(4));

        //String literals in java
        //java does memory optimization for references of same string
        String n1="Hello";
        String n2="Hello";
        //These two references points to the same object in the pool memory
        if(n1==n2)
        {
            System.out.println("The two string are same! ");
        }
        else{
            System.out.println("They are not equeal!");
        }

        //If we declare or create a new object then the pointer creates a new object in the pool and points that
        String n3=new String("Hello");
        if(n1==n3)
        {
            System.out.println("The two string are same! ");
        }
        else{
            System.out.println("They are not equeal!");
        }
    }
}
