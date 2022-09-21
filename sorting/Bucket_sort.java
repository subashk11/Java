package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Bucket_sort{
    static void bucket(int[] arr, int k)
    {
        int n= arr.length;
        int max_val=arr[0];

        for(int i=0;i<n;i++)
        {
            max_val=Math.max(max_val,arr[i]);
        }
        max_val++;
        ArrayList<ArrayList<Integer>> bkt=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<k;i++)
        {
            bkt.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++)
        {
            int bi=(k*arr[i])%max_val;
            bkt.get(bi).add(arr[i]);
        }
        for(int i=0;i<k;i++)
        {
            Collections.sort(bkt.get(i));
        }
        int idx=0;
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<bkt.get(i).size();j++)
            {
                arr[idx++]=bkt.get(i).get(j);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={22,45,67,88,65,34,11,10,4,123,35};
        bucket(arr,10);
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);

        }
    }
}
