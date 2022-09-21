package problems;
import java.util.Scanner;
public class napoleanCake {



        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t>0)
            {
                t--;
                int n=sc.nextInt();
                int[] arr=new int[n];
                for(int i=0;i<n;i++)
                {
                    arr[i]=sc.nextInt();
                }

                int curr=arr[n-1];
                StringBuilder res=new StringBuilder();
                for(int i=n-1;i>=0;i--)
                {
                    if(arr[i]>curr) curr=arr[i];
                    if(curr>0 && curr>=arr[i])
                    {
                        res.append("1 ");
                        curr--;
                    }else{
                        res.append("0 ");
                    }
                }
                System.out.println(res.reverse().toString().trim());
            }
        }

}
