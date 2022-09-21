package problems;

import java.util.Scanner;

public class Perfect_number {
    public static void main(String[] args) {
        System.out.println("Ënter the number :");
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int sum=0;

        //loop to fnd the factors
        for (int i=1;i<num;i++)
        {
            if (num % i == 0) {
                sum=sum+i;
            }
        }
        System.out.println(sum);

        //Loops to check the number is perfect or not
        if(sum == num)
        {
            System.out.println("The number is a perfect number");
        }
        else{
            System.out.println("The number is not a perfect number");
        }
    }
}
