import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
       System.out.println("Enter value of n for finding it's fibonacci number=");
       Scanner sankhya = new Scanner(System.in);
       int n= sankhya.nextInt();
       int count =2;
       int a=0,b=1,temp;
       while(count!=n+1)
       {
         temp=b;
         b=b+a;
         a=temp;
         System.out.print(b+" ");
         count+=1;
       }
       System.out.println("\n"+b);
    }
}