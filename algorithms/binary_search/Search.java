package algorithms.binary_search;

public class Search {
    static int bSearch(int[] arr,int x)
    {
        int n=arr.length;
        int low=0,high=n-1;

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
            else if(arr[mid]>x)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        System.out.println("The element is found at the index : "+bSearch(arr,40));
    }
}
