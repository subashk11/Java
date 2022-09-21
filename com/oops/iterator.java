package com.oops;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<String>();

        names.add("John");
        names.add("Peter");
        names.add("Carry");
        names.add("Sam");
        names.add("Stephen");

        //Creating an iterator
        Iterator<String> it = names.iterator();


        //next -- print the first item
        System.out.println("the first item is "+it.next()+"\n");

        //looping using an iterator
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        //removing an item
        it.remove();

        System.out.println(names.size());
    }
}
