package recursion;

import java.util.ArrayList;
import java.util.*;
public class Subset2 {
    public static void main(String[] args) {
        int arr[]={1,3,1};
        List<Integer> ans=new ArrayList<>();
        solve(0,arr,ans,0);
        System.out.println(ans);
    }

    static void solve(int ind,int[] arr,List<Integer> ans,int sum)
    {
        if(ind== arr.length)
        {
            ans.add(sum);
            return;
        }
        for(int i=ind;i<arr.length;i++)
        {
            if(i>ind && arr[i]==arr[i-1]) continue;
            solve(ind+1,arr,ans,sum+arr[i]);
        }
    }
}
