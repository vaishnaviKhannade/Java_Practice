   import java.util.Scanner;
   class Account{
   static  Scanner scan=new Scanner(System.in);
   final int account_no;
   String name;
   int age;
   float balance;
   

    Account(int r){
     account_no=r;
     name ="blank";
     age=0;
    balance=0.0f;
}
void SetAccount(){
    System.out.println("Enter your name ");
   name=scan.next();
    System.out.println(" Enter age");
  age=scan.nextInt();
   System.out.println("Enter balance of account");
   balance=scan.nextFloat();
 //  System.out .println("Your account has been created and your account no. is ="+ " " +a[i].account.no);
}
void Deposite (int amt){
   balance+= amt;
}
 void Withdraw(int amt){
 balance-=amt;
}
void Getparticulardetail(){
    
  System.out.println(account_no+"  "+name+"  "+age+" "+balance);
}


 void  GetList(Account a1[]){
  for(Account x : a1)
{ 
    x.Getparticulardetail();
}
}
 
public static void main(String []args)
{
  Account a[]=new Account[10];
int i;
int r=101;
int index=-1;
for(i=0;i<10;i++){
a[i]=new Account(r);
r++;
}
 System.out.println("Enter a number or zero for exit");
int k=scan.nextInt();
while(k!=0){
System.out.println("Enter 1 for creating account ");
System.out.println(" enter 2 for admin services ");
System.out.println(" enter 3 for other activities");
int c1=scan.nextInt();
switch(c1){
case 1:
            {
          if(index > -2 || index < 10)
         {   index++;
            a[index].SetAccount();
            break;
         }
           }

case 2:
       {
           System.out.println("enter admin account no for getting list of all accounts");
           int check=scan.nextInt();
          if (check==2000)
           { 
              a[0].GetList(a);
           }
           break;
       }
    
case 3:
     {
        System.out.println("For further details enter your account no. ");
         int acc1= scan.nextInt();
       for(int p=0;p<10;p++)
     {
          if (a[p].account_no==acc1)
        {
            System.out.println("Enter your choice :");
            System.out.println("1 for deposite ");
            System.out.println("2 for withdraw ");
            System.out.println(" 3 for your account details ");
            int n= scan.nextInt();

            switch(n){
                    case 1:
                          {   
                             System.out.println(" Enter amount which you want to deposite");
                             int amount=scan.nextInt();
                              for(int e=0;e<10;e++)
                              {
                                  if(a[e].account_no==acc1)
                                  {
                                  a[e].Deposite(amount);
                                  }
                              }
                      break;
                  }


                  case 2:
                    {   
                             System.out.println(" Enter amount which you want to withdraw");
                             int amount2=scan.nextInt();
                         for (i=0;i<10;i++)  
                          {  
                                   if(a[i].account_no==acc1)
                               a[i].Withdraw(amount2);
                           }
                      break;
                    }

                  case 3:
                    {   
                           
                         for (i=0;i<10;i++)  
                          {  
                                if(a[i].account_no==acc1)
                              { 
                                     a[i].Getparticulardetail();
                               }
                           }
                          break;
                    }

                  default : 
                               {
                                 System.out.println("Wrong choice");
                                 break;
                             }
           }
         break;  
         }
        }
       }
      }
      System.out.println("Enter 0 for for exit");
      k =scan.nextInt();
    }
  }
 }