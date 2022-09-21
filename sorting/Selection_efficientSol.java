package sorting;

public class Selection_efficientSol {
    static void swapfn(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void Selection_sort(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int min_idx=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min_idx])
                {
                    min_idx=j;
                }
            }
            swapfn(arr,i,min_idx);
        }
    }

    public static void main(String[] args) {
        int[] arr={23,45,99,12,4,78};
        Selection_sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
