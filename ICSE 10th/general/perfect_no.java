import java.util.*;
public class perfect_no
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any no.");
                int n = sc.nextInt();
        int sum = 0;
        for(int i =1;i<n;i++)
        {
            if (n%i ==0)
            sum = sum + i;
        }
        if(sum==n)
        System.out.println("it is a perfect no.");
        else
        System.out.println("it is not a perfect no.");
    }
}
            
