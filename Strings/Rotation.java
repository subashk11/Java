package Strings;

public class Rotation {
    public static void main(String[] args) {
        String a="abcd";
        String b="dcba";

        //take two pointer and compare first ant last value with the a and b
        //if two string length are not equal return false;

        int n1=a.length();
        int n2=b.length();
        int i=0;
        int j=n2-1;
        while(i<n1 && j>=0)
        {
            if(a.charAt(i)!=b.charAt(j))
            {
                System.out.println("Not a reverse!");
            }
            i++;
            j--;
        }
        System.out.println("Both string are reverse of each other");
    }
}
