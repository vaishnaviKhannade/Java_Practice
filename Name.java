import java.util.Scanner;

public class Name {
     
    public static void main(String[] arg)
    {
           System.out.println("Enter your salary");
           Scanner pagaar = new Scanner(System.in);
           int vaish = pagaar.nextInt();
           if(vaish>10000)
           {
               System.out.println("Total profit =" + (vaish+250));
           }
           else
           {
               System.out.println("Total profit is ="+ (vaish+200));
           }

    }
}