package sorting;

public class Insertion_sort {
    //Create a function for swapping
    static void swap(int[] arr, int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //Create a function for insertion sort to perform
    static void Insertion(int[] arr)
    {
        int length= arr.length;

        //Loop that runs the number of passes from 0 to n-2
        for (int i = 0; i < length-1; i++) {
            //Inner loop that compares each item to the left of the array
            //That runs from i+1 to 1
            for (int j = i+1; j >0 ; j--)
            {
                if (arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={50,30,20,24,12,43};
        Insertion(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
