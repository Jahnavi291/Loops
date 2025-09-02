import java.util.Scanner;
public class even1to100
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter the number");
        int i=1;
        while(i<=100)
        {
            if(i%2==0)
            {
                System.out.println(i+" ");
            }
            i++;
        }
        
        
            
            
        
    }
}