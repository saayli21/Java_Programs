package Practice;

import java.util.Scanner;

public class MaxValueOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the size of array:");
          int size=sc.nextInt();
          int arr[]=new int[size];
          System.out.println("Enter the elements of array");
          {
        	  for(int i=0; i<size; i++)
        	  {
        		  arr[i]=sc.nextInt();
        	  }
        	  int max=0;
        	  for(int i=1;i<arr.length;i++)
        	  {
        		  if(arr[i]>max)
        		  {
        			  max=arr[i];
        		  }
        	  }
        	  System.out.println("maximum value amongst the array is:"+max);
          }
          }

}
