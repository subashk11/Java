package pattern_Problems;

//Refer Kunal kushwaha(you tube) git hub library

public class Patterns {
    public static void main(String[] args) {
        pattern1( 5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern28(5);
        pattern30(5);
        pattern31(5);
    }

    static void pattern1(int n)
    {
        System.out.println("\nPattern 1 : ");
        //Check for the number of rows in the pattern
        for (int row = 1; row <=n ; row++) {

            //Check for the number of columns in each row
            //Find the formula or relation between the row and the column
            for (int col = 1; col <=n ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n)
    {
        System.out.println("\nPattern 2 : ");
        //Check for the number of rows in the pattern
        for (int row = 1; row <=n ; row++) {

            //Check for the number of columns in each row
            //Find the formula or relation between the row and the column
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n)
    {
        System.out.println("\nPattern 3 : ");
        //Check for the number of rows in the pattern
        for (int row = 1; row <=n ; row++) {

            //Check for the number of columns in each row
            //Find the formula or relation between the row and the column
            for (int col = 1; col <=n-row+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n)
    {
        System.out.println("\nPattern 4 : ");
        //Check for the number of rows in the pattern
        for (int row = 1; row <=n ; row++) {

            //Check for the number of columns in each row
            //Find the formula or relation between the row and the column
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n)
    {
        System.out.println("\nPattern 4 : ");
        //Check for the number of rows in the pattern
        //In this pattern we have the number of "rows=2*n-1" that is if n=5 we have 9 rows
        for (int row = 1; row <=2*n-1; row++) {

            //Check for the number of columns in each row
            //Find the formula or relation between the row and the column
            //The relation between each column and a row is number of elements in each column is "col=2*n-row"
            int numberOfColumns=row>n ? 2*n-row:row;
            for (int col = 1; col <=numberOfColumns ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n)
    {
        //Diamond pattern
        System.out.println("\nPattern 28 : ");
        //Check for the number of rows in the pattern
        //rows=2*n
        for (int row = 1; row <=2*n-1 ; row++) {
            int numberOfColelement=row>n?2*n-row:row;
            int spacesInEachRow=n-numberOfColelement;

            //print the spaces before the element
            for (int spaces = 1; spaces <=spacesInEachRow; spaces++) {
                System.out.print(" ");
            }
            //Check for the number of columns in each row
            //Find the formula or relation between the row and the column
            for (int col = 1; col <=numberOfColelement ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n)
    {
        //Outer loop for the number of rows
        for(int row=1;row<=n;row++)
        {
            //Calculate the spaces
            for(int spaces=0;spaces<n-row;spaces++)
            {
                System.out.print("  ");
            }

            //Print the left triangle of the pattern
            for (int col = row ;col >=1; col--) {
                System.out.print(col+" ");
            }

            //Print the right side triangle
            for (int col = 2; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern31(int n)
    {
        System.out.println("Pattern 32 ");
        int size=n;
        //For this pattern
        n=2*n;
        for(int row=1;row<n;row++)
        {
            for (int col = 1; col <n ; col++) {
                int setEveryIndex=1+size-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(setEveryIndex+" ");

            }
            System.out.println();
        }
    }

}
