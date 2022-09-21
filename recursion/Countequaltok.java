package recursion;

import java.util.ArrayList;

public class Countequaltok {
    static int solve(int idx,int[] arr,ArrayList<Integer> ans,int k,int sum)
    {

        if(idx== arr.length)
        {
            if(sum==k){

                return 1;
            }
            else return 0;
        }
        ans.add(arr[idx]);
        sum+=arr[idx];
        int l=solve(idx+1,arr,ans,k,sum);
        ans.remove(ans.size()-1);
        sum-=arr[idx];
        int r=solve(idx+1,arr,ans,k,sum);

        return l+r;
    }
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int k=2;
        int n=arr.length;
        ArrayList<Integer> ans=new ArrayList<>();
        int res=solve(0,arr,ans,k,0);
        System.out.println(res);
    }
}
