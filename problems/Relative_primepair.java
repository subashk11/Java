package problems;
import java.util.*;

public class Relative_primepair{

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            Long l=sc.nextLong();
            Long r=sc.nextLong();
            System.out.println("Yes");
            for(Long i=l;i<=r;i+=2)
            {
                System.out.println(Long.toString(i)+" "+Long.toString(i+1));
            }
        }

}
