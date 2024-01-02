package Practice;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1=new int[]{1,2,3,4};
		int[] arr2=new int[] {5,6,7,8};
		System.out.println("Original 2nd array is:");
		for(int i=0; i<arr2.length; i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
	
		System.out.println("Reverse 2nd array is:");
		for(int i=arr2.length-1; i>=0; i--)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
			
		int[] arr3=new int[] {8,7,6,5};
		for(int i=0; i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
	}

}
