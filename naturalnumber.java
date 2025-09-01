import java.util.Scanner;
public class naturalnumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre value of n: ");
        int n=sc.nextInt();
       int i=n;
       while(i>=1)
       {
        System.out.println(i+" ");
        i--;

       }

    }
}