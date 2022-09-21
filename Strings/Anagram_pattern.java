package Strings;

import java.util.Arrays;

public class Anagram_pattern {
    static final int Char=256;
    //Search for a anagram pattern in a plain text
    //geeksforgeeks //frog

    static boolean pattern(String pl,String pt)
    {
        int n=pl.length();
        int m=pt.length();

        for (int i = 0; i < n-m; i++) {
            if(Anagram(pt,pl,i)) return true;
        }
        return false;
    }

    static boolean Anagram(String pt,String pl,int i)
    {
        int[] count=new int[Char];
        for (int j = 0; j < pt.length() ; j++) {
            count[pt.charAt(j)]++;
            count[pl.charAt(j+i)]--;
        }
        for (int j = 0; j < Char; j++) {
            if (count[j]!=0) return false;
        }
        return true;
    }

    static boolean optimized_approach(String pl,String pt)
    {
        int count_pl[]=new int[Char];
        int count_pt[]=new int[Char];
        for (int i = 0; i < pt.length(); i++) {
            count_pt[pt.charAt(i)]++;
            count_pl[pl.charAt(i)]++;
        }
        for (int i = pt.length(); i < pl.length(); i++) {
            if (areSame(count_pl,count_pt)) return true;
            count_pl[pl.charAt(i)]++;
            count_pl[pl.charAt(i-pt.length())]--;
        }
        return false;
    }

    static boolean areSame(int[] count_pl, int[] count_pt) {
        if(Arrays.equals(count_pl,count_pt)) return true;
        else return false;
    }

    public static void main(String[] args) {
        String pl="geeksforgeeks";
        String pt="frog";
        boolean ans=pattern(pl,pt);
        boolean opt=optimized_approach(pl,pt);
        if (opt==true)
        {
            System.out.println("There is a anagram pattern matched");
        }else {
            System.out.println("there is no such pattern");
        }
    }
}
