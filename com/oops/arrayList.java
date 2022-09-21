package com.oops;
import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    //ArrayList is a special datatype alos performs like normal array
    //But its size can be dynamic can be modified.
    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        for (int i=0;i<10;i++)
        {
            arr1.add(i+1);
        }

        //For Each loop
        //Iterators through each item in an array.
        for(int i:arr1)
        {
            System.out.println(i);
        }
        //or use -- System.out.println(arr1):

        arr1.add(100);
        arr1.add(23);
        arr1.add(11);

        //.get() -- Get a particular item in a arrayList.
        System.out.println("Getting a particular item at the index 6 in a arraylist "+arr1.get(6));

        //set or change a value .
        arr1.set(0,45);

        //Remove() --removes an item in an arrayList.
        arr1.remove(10);

        //Clear() -- used to remove or clear the entire array.   arr1.clear().

        //Size of an arrayList.
        System.out.println("The size of the ArrayLIst is : "+arr1.size() );
        //Sorting an array
        Collections.sort(arr1);
        System.out.println(arr1);
    }
}
