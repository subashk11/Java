package recursion;

import java.util.ArrayList;
import java.util.List;

public class permutations2 {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();

        solve(0,ans,arr,temp);
        System.out.println(ans);
    }
    static void solve(int idx,List<List<Integer>> ans,int[] arr,ArrayList<Integer> temp)
    {
        if(idx==arr.length)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<arr.length;i++)
        {
            swap(i,idx,arr);
            temp.add(arr[idx]);
            solve(idx+1,ans,arr,temp);
            swap(i,idx,arr);
            temp.remove(temp.size()-1);
        }
    }

    static void swap(int i,int j,int[] arr)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
