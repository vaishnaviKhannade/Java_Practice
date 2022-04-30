import java.util.Scanner;
class person{
static Scanner scan=new Scanner(System.in);
  String name;
   int rno;

void get(person a1[]){
   for(int i=0;i<3;i++){
   System.out.println(a1[i].name +' '+a1[i].rno);
}
}

public static void main(String []args){
     person a[]=new person[3];
     for(int i=0;i<3;i++)
     { 
        a[i]=new person();
         a[i].name= scan.next();
         a[i].rno=scan.nextInt();
       } 
    person p=new person();
     p.get(a);
}
}