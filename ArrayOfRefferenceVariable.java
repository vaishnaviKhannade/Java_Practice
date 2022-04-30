import java.util.Scanner;
class ArrayOfRefferenceVariable{
static Scanner scan=new Scanner(System.in);
  String name;
   int rno;

void get(ArrayOfRefferenceVariable a1[]){
   for(int i=0;i<3;i++){
   System.out.println(a1[i].name +' '+a1[i].rno);
}
}

public static void main(String []args){
     ArrayOfRefferenceVariable a[]=new ArrayOfRefferenceVariable[3];
     for(int i=0;i<3;i++)
     { 
        a[i]=new ArrayOfRefferenceVariable();
         a[i].name= scan.next();
         a[i].rno=scan.nextInt();
       } 
    ArrayOfRefferenceVariable p=new ArrayOfRefferenceVariable();
     p.get(a);
}
}