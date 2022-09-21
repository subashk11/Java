package sorting;

public class Selection_sort {

    //Selection sort : Select the particular item from the array and swap or arrange in order.
    static void s_sort(int[] arr)
    {
        int length=arr.length;
        //Creating the temporary array to store sorted item in order
        int[] temp=new int[length];

        for(int i=0;i<length;i++)
        {
            //Initialize the minimum index to zero
            int min_ind=0;
            //Finding the minimum item for each passes
            for(int j=0;j<length;j++)
            {
                if(arr[j]<arr[min_ind])
                {
                    min_ind=j;
                }
            }
            //Assign the min value in order from 0 to i in temp array
            temp[i]=arr[min_ind];

            //Change the found min value in the array to max constant
            arr[min_ind]=Integer.MAX_VALUE;

        }

        //Loop for copying the temp array elements to the array
        for (int i = 0; i < length; i++) {
            arr[i]=temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[]={30,10,20,15,60,40};
        s_sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
