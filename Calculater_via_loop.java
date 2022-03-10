import java.util.Scanner;

public class Calculater_via_loop {
    public static void main(String[] args)
    {
        Scanner operator=new Scanner(System.in);
        int ans=0;
        
        while(true)
        {

            System.out.println("Enter operator=");
        char op= operator.next().trim().charAt(0);
       
        if(op=='+'|| op=='-' || op== '*' || op=='/' ||op=='%')
        {
            //asking for 2 numbers
            System.out.println();
            System.out.println("Enter 2 numbers=");
            int a= operator.nextInt();
            int b= operator.nextInt();      

            if(op=='+')
            {
                ans=a+b;
            }

            if(op=='-')
            {
                ans=a-b;
            }

            if(op=='*')
            {
                ans=a*b;
            }

            if(op=='/')
            {
                ans=a/b;
            }

            if(op=='%'&& b>a)
            {
                ans=a%b;
            }
        }
        else{
            if(op=='X'||op=='x')
            {
               break;
            }
            else
            {
               System.out.println("Wrong input!!");
               break;
            }
        }
          System.out.println(ans);
        }
    }
}
