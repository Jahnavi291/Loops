import java.util.Scanner;
public class oddnumbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("the odd numbers are:");
        int i=1;
        while(i<=100)
        {
            if(i%2!=0)
            {
                System.out.println(i+" ");
                
            }
            i++;
        }
    }
}