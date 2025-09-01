import java.util.Scanner;
public class naturalnumbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre value of n: ");
        int n=sc.nextInt();
       int i=1;
       while(i<=n)
       {
        System.out.println(i+" ");
        i++;

       }

    }
}