package problems;

public class factorial {
    static  int findElement(int[] arr,int num)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       int[] arr={14,45,65,67,34,11,45,19};
       int target=0;
        int res=findElement(arr,target);
        System.out.println("The element is found at the index : "+res);
    }
}
