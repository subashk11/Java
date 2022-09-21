package com.oops;

import java.util.Collections;
import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        //Linked list perform similar like arrayList but each item is connected to the next item
        LinkedList<String> newArr=new LinkedList<String>();

        //add() -- To add new items to the LinkedList.
        newArr.add("Mercedes");
        newArr.add("Ford");
        newArr.add("Buggati");
        newArr.add("Audi");
        newArr.add("BMW");


        //Print items as a linked list
        System.out.println(newArr);

        //get() --used to get a particular item.
        System.out.println("Getting particular item at index 3 : "+newArr.get(3));

        //Sort() --Used to sort Linkedlist
        Collections.sort(newArr);
        System.out.println("This is the sort of the LinkedList "+newArr );

        //Size() --Used to know the size of the LinkedList --starts with value is 1.
        System.out.println("The size of the LinkedList is "+newArr.size());

        //Operations in LinkedList.
        //addFirst()--Used to add new item to the front of the linkedlist
        newArr.addFirst("Mini Cooper");

        //addLast() -- Used to add new item to the last of the LinkedList.
        newArr.addLast("Lambogini");

       //removeFirst() -- Used to remove the first item of the LinkedList.
        newArr.removeFirst();

        //removeLast() --Used to remove the last item of the Linkedlist.
        newArr.removeLast();

        //getFirst() -- Used to get the first item of the LinkedList.
        System.out.println("The First item of the linked list is "+newArr.getFirst());

        //getLast() -- Used to get the last item of the LinkedList.
        System.out.println("The First item of the linked list is "+newArr.getLast());
    }
}
