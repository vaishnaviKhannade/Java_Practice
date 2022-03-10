
import java.util.Scanner;

public class Counting_Of_Occureence {
    public static void main(String[] args)
    {
        Scanner number =new Scanner(System.in);
        System.out.println("Enter a number=");
        int  n= number.nextInt();
        System.out.println("Enter which no. among this integer we have to count=");
        int value= number.nextInt();
        int count=0;
        while(n>0)
        {
           int reminder = n % 10; 
           if(reminder==value)
           {
               count=count+1;
           }
           n=n/10;
        }
        System.out.println(count);
    }
    
}
