import java.util.*;
public class array_1
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any array");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            System.out.println("enter any elements");
            a[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
} 
        
        