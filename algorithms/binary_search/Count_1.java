package algorithms.binary_search;

public class Count_1 {
    static int countOne(int[] arr)
    {
        int n=arr.length,low=0,high=n-1;
        while (low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==0)
            {
                low=mid+1;
            }
            else{
                if (mid==0 || arr[mid-1]==0)
                {
                    return (n-mid);
                }
                else
                {
                    high=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={0,0,0};
        //case 1 :
        System.out.println(countOne(arr));

        //case 2:
        int[] arr2={0,0,0,0,1,1,1,1};
        System.out.println(countOne(arr2));
    }
}
