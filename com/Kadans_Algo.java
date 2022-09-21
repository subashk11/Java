package com;

public class Kadans_Algo {
    static int maxSub(int[] arr)
    {
        int max_so_far=0;
        int n= arr.length;
        int max_ending=0;
        for(int i=0;i<n;i++)
        {
            max_ending=max_ending+arr[i];
            if(max_so_far<max_ending)
            {
                max_so_far=max_ending;
            }
            if(max_ending<0)
            {
                max_ending=0;
            }

        }
        return max_so_far;
    }
    public static void main(String[] args) {
        int arr[]= {1, 2, -7, 3, -8, -9, 4, 8, -4, 9, -7, 3, 1};
        System.out.println("the max of the sub array is "+maxSub(arr));
    }
}
