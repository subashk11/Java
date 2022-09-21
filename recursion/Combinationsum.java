package recursion;

import java.util.ArrayList;
import java.util.*;
public class Combinationsum {
    static void solve(int idx,int[] arr,List<List<Integer>> ans,int target,ArrayList<Integer> curr)
    {
        if(idx==arr.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(curr));
                return;
            }
            return ;
        }

        if(arr[idx]<=target)
        {
            curr.add(arr[idx]);
            solve(idx+1,arr,ans,target-arr[idx],curr);
            curr.remove(curr.size()-1);
        }
        solve(idx+1,arr,ans,target,curr);
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,4,6,7};
        int target=7;
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        ArrayList<Integer> curr=new ArrayList<Integer>();
        solve(0,arr,ans,target,curr);
        System.out.println(ans);
    }
}
