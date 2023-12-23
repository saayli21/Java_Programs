package Practice;

import java.util.Scanner;

public class RevserseStringInArray {

	public static void main(String[] args) {
	    
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements in array");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
	//	String arr[]= {"Rugved","Shreepad","Sayali","Tanuja","Saloni","Renuka","Achal"};
		System.out.println("Original Array:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("Reverse order:");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]+" ");
		}

	}

}
