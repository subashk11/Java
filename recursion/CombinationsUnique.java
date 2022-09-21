package recursion;

import java.util.ArrayList;
import java.util.*;

public class CombinationsUnique {
    //sum equal to k but unique
    public static void main(String[] args) {
        int arr[]={10,1,2,7,6,1,5};
        int target=8;
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> curr=new ArrayList<>();
        Arrays.sort(arr);
        solve(0,arr,target,ans,curr);
        System.out.println(ans);
    }

    static void solve(int ind,int[] arr,int target,List<List<Integer>> ans,ArrayList<Integer> curr)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=ind;i<arr.length;i++)
        {
            if(i>ind && arr[i]==arr[i-1]) continue;
            if(target<arr[i]) break;
            curr.add(arr[ind]);
            solve(i+1,arr,target-arr[i],ans,curr);
            curr.remove(curr.size()-1);
        }
    }
}
