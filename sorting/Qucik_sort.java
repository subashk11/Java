package sorting;

import java.util.Arrays;

public class Qucik_sort {

    //using Lamuto partition

    //Creating a partition function
    static int partition(int[] arr,int low,int high)
    {
        //Here we assume the pivot as always the last element in the array
        int pivot =high;

        //Window size of the elements lower than the pivot
        //Consider the initial window size is -1
        int i=low-1;

        //pointer that moves from start from low to high-1 in the array
        int j=low;

        //loops that runs from low to high
        for(j=low;j<=high-1;j++)
        {
            //condition that checks the element is lesser than the pivot
            if(arr[j]<arr[pivot])
            {
                //incrementing the window size of the index
                i++;

                //Swapping the i with the found lesser element at j ,
                swap(arr,i,j);
            }
            //If the element is greater or equeal to the element at the pivot ignore it
        }

        //Swapping the pivot element with the i+1 element in the array.
        swap(arr,i+1,high);
        return (i+1);
    }

    static void swap(int[] arr, int num1, int num2) {
        int temp=arr[num1];
        arr[num1]=arr[num2];
        arr[num2]=temp;
    }

    static  void Qsort(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int piv=partition(arr,low,high);

            Qsort(arr,low,piv-1);
            Qsort(arr,piv+1,high);
        }
    }

    //main function
    public static void main(String[] args) {
        int arr[]={3,5,2,7,10,4,1};
        Qsort(arr,0,6);
        System.out.println(Arrays.toString(arr));
    }
}
