package sorting;

import java.util.Arrays;

public class merge_sort {
    //Using Recursion
    static int[] mergeSort(int[] arr)
    {
        int length=arr.length;
       //Checks if the length of the array is 1 return the array.
        if(length==1) {
            return arr;
        }

        //Calculate the mid of the array to split the array into two half
        int mid=length/2;

        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,length));

        return merge(left,right);
    }

    static int[] merge(int[] left,int[] right)
    {
        int[] ans=new int[left.length+right.length];
        //pointer moves through left array
        int i=0;

        //pointer that moves through right array
        int j=0;

        //pointer that moves through the final ans array
        int k=0;

        while(i< left.length && j< right.length)
        {
            if(left[i]<right[j])
            {
                ans[k]=left[i];
                i++;
                k++;
            }
            else{
                ans[k]=right[j];
                k++;
                j++;
            }
        }
        //to copy the remainig items from the left or right array to the ans array
        while(i<left.length)
        {
            ans[k]=left[i];
            k++;
            i++;
        }
        while(j< right.length)
        {
            ans[k]=right[j];
            k++;
            j++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr={23,45,65,12,1};
        int[] ans=mergeSort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(ans[i]);
        }
    }
}
