package Practice;

import java.util.Scanner;

public class RemoveDupicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements in java:");
		for(int i=0;i<size;i++)
		{
			 arr[i]=sc.nextInt();
		}
		//int arr[]= {1,1,2,3,2};
		System.out.println("Array in reverse order:");
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]==arr[i])
				{
					count++;
				}
			}
				if(count==0)
				{
					System.out.println(arr[i]+" ");
				}
			}
		}
		

	}


