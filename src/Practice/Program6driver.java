package Practice;

import java.util.Scanner;

public class Program6driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc=new Scanner(System.in);
		   Program6Encapsulation p=new Program6Encapsulation("Siya", 5, 8,'a',88.60);
	       System.out.println("Enter sid");
	       int sid=sc.nextInt();
	       System.out.println(p.getperc(sid));
	}

}
