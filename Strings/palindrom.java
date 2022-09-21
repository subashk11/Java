package Strings;

//simple string problem to check whether the given string is palindrome or not
public class palindrom {

    //palindrom-
    //1. madam-after reversing the string we get -madam
    //both are equal this is an example of an palindrome
    static Boolean check(String s1)
    {
        //create a string of class string builder
        StringBuilder s2=new StringBuilder(s1);
        //use the reverse function avaliable in string builder class
        s2.reverse();
        //change the type of the string s2 to string class
        if(s1.equals(s2.toString()))
        {
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        String s1="abba";
        boolean ans=check(s1);
        if(ans)
        {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
