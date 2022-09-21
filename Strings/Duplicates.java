package Strings;

import java.util.*;

public class Duplicates {
    public static void main(String[] args) {
        String s="helloeveryone";
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }

        for(Map.Entry mapElement:map.entrySet())
        {
            char c=(char)mapElement.getKey();
            int n=((int)mapElement.getValue());
            if(n>1)
            {
                System.out.println(c+" "+n);
            }
        }
    }
}
