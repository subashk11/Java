package com.java;
import java.util.*;
public class multiDimension {


        public static void main(String[] args) {
            //General initialization and declaration of a 2d-Array
            int[][] arr=new int[3][3];
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    arr[i][j]=i*10;
                }
            }
            System.out.println("The items in the 2d array is :");
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[i].length;j++)
                {
                    System.out.print("arr["+i+"]["+j+"] = "+arr[i][j]+" ");
                }
                System.out.println();
            }

            //Another way of declaring a 2d-Array
            int[][] mul_arr={{1,2,3},{4,5,6}};
            for (int i = 0; i < mul_arr.length ; i++) {
                for (int j = 0; j < mul_arr[i].length; j++) {
                    System.out.println(mul_arr[i][j]);
                }
            }

        }

}
