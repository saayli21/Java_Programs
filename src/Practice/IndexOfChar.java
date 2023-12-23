package Practice;

import java.util.Scanner;

public class IndexOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the character");
	    char ch=sc.next().charAt(0);
		String s="Basavanagudi";
		System.out.println(s.indexOf(ch));

	}

}
