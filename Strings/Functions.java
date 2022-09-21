package Strings;

public class Functions {
    public static void main(String[] args) {
        //Some of the  functions that can be done in string class

        //1.Contains
        String s1="GoodMorning";
        String s2="Mor";

        //Contains functions return a boolean value not integer type.
        System.out.println("The use of contains function : ");
        if(s1.contains(s2))
        {
            System.out.println("yes");
        }
        else{
            System.out.println("Not match");
        }

        //2.equals
        String s3="matching";
        String s4="matching";

        //checks for the strings given are equal and return boolean value if matching or not
        System.out.println("The Use of Equals is : ");

        if (s3.equals(s4))
        {
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }

        //3.Indexof
        String s5="Have a nice day";
        String s6="a";

        //Returns the index of the found in the string
        int ans=s5.indexOf(s6);
        System.out.println("The string is found at the index : "+ans);

        //4.Compareto
        //used to found which is lexicographical greater string
        String s7="alphabet";
        String s8="zebra";

        //This function sees the first letter of the string ie. in this case a and z
        //value of a - 1 and z-26 so z is greater so positive value and returns 0 if equal.
        //The ans in negative since z is greater than a.
        int comp=s1.compareTo(s2);
        if(comp==0)
        {
            System.out.println("The two strings are equal ! ");
        }
        else if(comp>1)
        {
            System.out.println("The first string s7 is greater than s8 ");
        }
        else{
            System.out.println("The first string is smaller than the other ");
        }
    }

}
