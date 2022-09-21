package com.oops;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<String> cars=new HashSet<String>();

        //to add a new item
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mercedes");
        cars.add("Mini cooper");
        cars.add("Volvo");

        //for check for a particular item is present or not.
        System.out.println(cars.contains("BMW"));

        //for printing the items
        System.out.println(cars);
        //or
        for (String i:cars) {
            System.out.println("\nusing loops : "+i);
        }

        //to remove an item
        cars.remove("Volvo");

        //To clear the whole hashset
        //cars.clear();

        //To know the size of the hashset
        System.out.println("\n the size of the hash set: cars is = "+cars.size());
    }
}
