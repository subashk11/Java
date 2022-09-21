package algorithms.binary_search;

public class squareroot {
    static  int sqRoot(int n)
    {
        int low=0,high=n,ans=-1;

        while(low<=high)
        {
            int mid=(low+high)/2;
            int msq=mid*mid;
            if(msq == n)
            {
                return mid;
            }
            else if(msq>n)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n=30;
        System.out.println(sqRoot(n));
    }
}
