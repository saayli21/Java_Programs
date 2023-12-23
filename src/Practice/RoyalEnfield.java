package Practice;

public class RoyalEnfield {  //PROGRAM7
 String ModelName;
 String Colour;
 public RoyalEnfield(String ModelName, String Colour)
 {
	 this.ModelName=ModelName;
	 this.Colour=Colour;
	 System.out.println("Model Name:"+this.ModelName+" "+ "Bike Colour:"+this.Colour);
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       RoyalEnfield e1=new RoyalEnfield("GT", "Jungle Green");
       RoyalEnfield e2=new RoyalEnfield("Himalayan", "Balck");
       
	}

}
