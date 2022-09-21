package com.oops;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> ageData=new HashMap<String,Integer>();

        //.put() -- used to add new item to the HashMap
        ageData.put("John",20);
        ageData.put("Carry",19);
        ageData.put("Sam",21);
        ageData.put("Tom",21);

        //.get() --Used to get the values from the HashMap.
        //Enter the key value.
        System.out.println("The age of Tom is "+ageData.get("Tom"));

        ageData.put("George",23);
        //Reomve() --Used to remove the item from the HashMap
        ageData.remove("Tom");

        //Size()
        System.out.println("The size is :"+ageData.size());

        //To get all the key values.
        for (String i: ageData.keySet())
        {
            System.out.println(i);
        }

        //To get only the values.
        for (int i: ageData.values())
        {
            System.out.println(i);
        }

        //To print both the values and keys
        for (String i:ageData.keySet())
        {
            System.out.println("The key is "+i+" and the value is "+ageData.get(i));
        }
    }
}
