package Practice;

import java.util.Scanner;

public class Program1StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
       
        int temp=num;
        int strong=0;
        while(num!=0)
        {
        	int rem=num%10;
        	int fact=1;
        	for(int i=1;i<=rem;i++)
        	{
        		fact=fact*i;
        	}
        	strong=strong+fact;
        	num=num/10;
        }
        	if(strong==temp)
        	{
        		System.out.println("true");
        	}else 
        	{
        		System.out.println("false");
        	}
        }
	}







