package recursion;

//store the all possible subsequence of a array sum in sorted order
import java.util.ArrayList;
import java.util.*;

public class Subset {
    static void solve(int idx,int[] arr,List<Integer> ans,int sum)
    {
        if(idx==arr.length)
        {
            ans.add(sum);
            return;
        }
        solve(idx+1,arr,ans,sum+arr[idx]);
        solve(idx+1,arr,ans,sum);
    }

    public static void main(String[] args) {
        int arr[]={1,3,1};
        List<Integer> ans=new ArrayList<>();
        solve(0,arr,ans,0);

        //to print in increasing order
        Collections.sort(ans);
        System.out.println(ans);
    }
}
