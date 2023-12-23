package Practice;

public class Program3StringLowerUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="AAAAbbbccDDDDDeeeeFFFFgggg";
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>='A' && arr[i]<='Z')
			{
				arr[i]=(char) (arr[i]+32);
			}
			else
			{
				arr[i]=(char)(arr[i]-32);
			}
				
			}
		 String s1=" ";
		 for(int i=0;i<arr.length;i++) {
				s1=s1+arr[i];
			}
			System.out.println(s1);
		
	}

}
