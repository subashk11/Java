import java.util.*;

class lamutoPartition{
    public static void main(String[] args) {
        int[] arr={2,16,45,32,11,5,3,7,10};
        
        int n=arr.length;

        //Lets assume the pivot as 10
        int piv=arr[n-1];

        int low=0;
        int high=n-1;
        //Calling the partitioning function
        partition(arr,piv,low,high);
        for(int i:arr){
            System.out.println(i);
        }
        
    }

    static void partition(int[] arr,int piv,int l,int h){
        int i=l-1;

        for(int j=l;j<=h;j++){
            if(arr[j]<piv){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp=arr[i+1];
        arr[i+1]=piv;
        arr[h]=temp;
    }
}