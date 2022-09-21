package com.java;
public class Arrays {
    public static void main(String[] args) {
        //Array-To store a list of items

        //Declaration and initalization
        String[] names ={"Iron Man","Hulk","Spider Man","Thor"};

        //access an element
        for (int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }

        //2d or multi-dimensinal array
        int[][] num1={{1,2,3,4},{5,6,8}};

        //access a single item
        System.out.println("\n"+num1[1][1]+"\n");

        for(int i=0;i< num1.length;i++)
        {
            for (int j=0;j< num1[i].length;j++)
            {
                System.out.println(num1[i][j]);
            }
        }
    }
}
