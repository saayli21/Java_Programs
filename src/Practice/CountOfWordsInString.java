package Practice;

public class CountOfWordsInString {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="Sky is Beautiful";
        String arr[]=s1.split(" ");
        int count=0;
        int i=0;
        if(arr[i]!=null)
        	{
        	 for(i=0; i<arr.length; i++)
        		 count++;
        	}
        	System.out.println(count);
        }
      }



