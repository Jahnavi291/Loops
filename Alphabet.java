import java.util.Scanner;
public class Alphabet{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an alphabets: ");
        char ch='A';
        while(ch<='Z')
        {
            System.out.println(ch+" ");
            ch++;
        }

    }
}