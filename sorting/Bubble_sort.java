package sorting;


public class Bubble_sort {

    //Swap function to change the two numbers in the array
    static void swap(int i,int j,int[] arr)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void  b_sort(int[] arr)
   {
       //To know the length of the array
        int n=arr.length;

        //Outer loop that runs for the number of passes from 0 to n-1
       for(int i=0;i<n-1;i++)
        {
            boolean isSwapped=false;
            //Inner loop that checks upto n-i-1 elements for each passes
            for(int j=0;j<n-i-1;j++)
            {
                //checks if next element is lesser then the previous and swaps the two elemets
                if(arr[j]>arr[j+1])
                {
                    swap(j,j+1,arr);
                    isSwapped=true;
                }
                //checks if the array is already in sorted order
                if (isSwapped==false) break ;
            }
        }
   }

    public static void main(String[] args) {
        int arr[]={30,20,10,40,25};
        b_sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
