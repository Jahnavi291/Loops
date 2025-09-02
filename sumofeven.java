import java.util.Scanner;
public class sumofeven
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("sum of all even numbers is :");
        int n=sc.nextInt();
        int i=2;
        int sum=0;
        while(i<=n)
        {
            sum+=i;
            i+=2;

        }
        System.out.println("sum of all even numbers " +n+"="+sum);
    }
}