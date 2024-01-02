package Practice;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements in array:");
		for(int i=0;i<size;i++)
			
		{
			arr[i]=sc.nextInt();
		}
     
       int sum=0;
       for(int i=0;i<arr.length;i++)
       {
    	   sum=sum+arr[i];
       }
       System.out.println("Sum of elements of array is:"+sum);
	}

}
