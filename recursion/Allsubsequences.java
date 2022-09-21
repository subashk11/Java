package recursion;

import java.util.*;

public class Allsubsequences {
    public static void main(String[] args) {
        int[] arr=new int[5];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=i+1;
        }
        List<ArrayList<Integer>> ans=new ArrayList< >();
        ArrayList<Integer> seq=new ArrayList<Integer>();
        solve(0,arr,ans,seq);
        for(ArrayList<Integer> e:ans)
        {
            System.out.println(e);
        }
    }

    static void solve(int idx,int[] arr,List<ArrayList<Integer>> ans,ArrayList<Integer> seq)
    {
        //base case to check if index == size of array

        if(idx==arr.length)
        {
            ans.add(new ArrayList<>(seq));
            return ;
        }

        seq.add(arr[idx]);
        solve(idx+1,arr,ans,seq);
        seq.remove(seq.size()-1);
        solve(idx+1,arr,ans,seq);
    }
}