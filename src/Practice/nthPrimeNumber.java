
package Practice;

import java.util.Scanner;

public class nthPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
	    int count=0;
	    int num=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter digit");
	    int n=sc.nextInt();
	    
	    while (count < n)
	        {
	          num=num+1;
	          for (i = 2; i <= num; i++){
	            if (num % i == 0) {
	            break;  
	        }
	      }
	            if(i==num)
	          {
	            count=count+1;
	          }
	    }
        System.out.println(n +"th prime number is:"+num);  

	}
}
