package Practice;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter elements in array:");
		for(int i=0; i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
	//	int arr[]= {5,6,2,3,1,2};
		System.out.println("Array after sorting:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int temp=0;
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}

	}

}
