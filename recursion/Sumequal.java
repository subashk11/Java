package recursion;

import java.util.ArrayList;

public class Sumequal {
    //change bool
    static void solve(int idx,int[] arr,int x,int sum,ArrayList<Integer> ans)
    {
        if(idx== arr.length)
        {
            if(sum==x)
            {
                System.out.println(ans);
                return ;
                //return true
            }
            //return false
            return ;
        }

        ans.add(arr[idx]);
        sum+=arr[idx];
        solve(idx+1,arr,x,sum,ans);
        //To print only one subsequence
        //if(solve(idx+1,arr,x,sum,ans)==true) return true;
        ans.remove(ans.size()-1);
        sum-=arr[idx];
        solve(idx+1,arr,x,sum,ans);
        //To print only one subarray
        // if(solve(idx+1,arr,x,sum,ans)==true)return true;
        //return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int x=2;
        ArrayList<Integer> ans=new ArrayList<>();
       // boolean flag=solve(0,arr,x,0,ans);
        //if(flag)
        //{
          //  System.out.println("yes");
        //}else {
            //System.out.println("no");
        //}
        solve(0,arr,x,0,ans);
    }
}
