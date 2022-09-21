package recursion;

import java.util.ArrayList;
import java.util.*;

public class permutaitons {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        boolean[] flag=new boolean[arr.length];
        List<List<Integer>>ans=new ArrayList<>();
        ArrayList<Integer> curr=new ArrayList<>();
        solve(0,arr,ans,curr,flag);
        System.out.println(ans);
    }

    static void solve(int idx,int[] arr,List<List<Integer>> ans,ArrayList<Integer> curr,boolean[] flag)
    {
        if(curr.size() ==arr.length)
        {
            ans.add(new ArrayList<>(curr));
            return ;
        }
        for(int i=0;i<arr.length;i++)
        {
            if (!flag[i]) {
                flag[i]=true;
                curr.add(arr[i]);
                solve(i+1,arr,ans,curr,flag);
                curr.remove(curr.size()-1);
                flag[i]=false;
            }
        }
    }
}
