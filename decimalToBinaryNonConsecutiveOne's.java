


/*Question:--write a program tp print all binary representation of integer a[i] with range of(m,n)such that the binary
representation of a[i] does not contain tow or more consecutive 1's in it.
 the boundary values are to be excluded from the check & the binary representation of integer must be printed
in ascending order in lines */


import java.util.*;
import java.io.*;

class decimalToBinaryNonConsecutiveOnes{
	
public static void main(String[]args)
 { 

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter value of m ");
	int m=scan.nextInt();
	System.out.println("enter value of n ");
	int n=scan.nextInt();
	for(int i=m+1;i<n;i++)
	{
	binaryConverter(i);
	System.out.println();
	}
	
 }
 
 public static void binaryConverter(int val){
 
	int arr[]=new int[16];
	int i=0;
	int flag=0;
	//System.out.print(val+"=");
    for(i=0;val>0;i++)
	{
		 arr[i]=val%2; 
		val=val/2;
		
	}
	 for(int j=i-1;j>=0;j--)
	{
		if(arr[j]==arr[j+1]&& arr[j]==1)
		{
			flag=1;
	  }
 }
 for(int k=i-1;k>=0;k--)
 {
	 if(flag==1)
			break;
		else
			System.out.print(arr[k]);
 }
}
}
