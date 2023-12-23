package Practice;

import java.util.Scanner;

public class ReverseArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements in array:");
		for(int i=0;i<size;i++)
		{
			 arr[i]=sc.nextInt();
		}
		//TO PRINT ORGINAL ARRAY WE USE FOR LOOP
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//TO PRINT ARRAY IN REVERSE ORDER
		System.out.println("Array in reverse order:");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		  

}
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//        int arr[]= {1,1,2,3,2};
//        int arr1[]=new int[arr.length];
//        int i=0;
//        
//        for(int k=arr.length-1;k>=0;k--)
//        {
//       		arr1[i++]=arr[k];
//        }
//        
//        System.out.println("Original array:");
//        for(int i1=0;i1<arr1.length;i1++)
//        {
//        	System.out.print(arr[i1]+" ");
//        }
//        System.out.println();
//        System.out.println("Reversed array:");
//        for(int i1=0;i1<arr1.length;i1++)
//        {
//        	System.out.print(arr1[i1]+" ");
//        }
//	} 
//
//}
