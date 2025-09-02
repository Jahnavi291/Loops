import java.util.Scanner;
public class sumofodd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("sum of odd numbers are :");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n)
        {
            sum+=i;
            i+=2;

        }
        System.out.println("the odd numbers are:"+n+"="+sum);
    }
}