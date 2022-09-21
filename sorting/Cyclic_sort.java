package sorting;

public class Cyclic_sort {
    //Create a swap function
    static void swap(int[] arr,int num1,int num2)
    {
        int temp=arr[num1];
        arr[num1]=arr[num2];
        arr[num2]=temp;
    }
    //Create a function for performing cyclic sort
    static  void cyclic(int[] arr)
    {
        int n= arr.length;

        int i=0;

        while(i<n)
        {
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex])
            {
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={3,5,2,1,4};
        cyclic(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
