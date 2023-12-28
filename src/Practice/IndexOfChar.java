package Practice;

import java.util.Scanner;

public class IndexOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter the character");
//	    char ch=sc.next().charAt(0);
//		String s="Basavanagudi";
//		System.out.println(s.lastIndexOf(ch));
		
		String s1="Basavanagudi";
		int count=0;
		String arr[]=s1.split("");
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("a"))
				count++;
		}
        System.out.println(s1+" "+"contains"+" "+count+"occurance of 'a'");
	}

}
