package Practice;

public class Program6Encapsulation {

	private String sname;
	private int sid=5;
	private int std;
	private char sec;
	private double perc;
	public Program6Encapsulation(String sname, int sid,int std, char sec, double perc)
	{
		this.sname=sname;
		
		this.std=std;
		this.sec=sec;
		this.perc=perc;
	}
	//GETTER() FOR SNAME
	public String getsname()
	{
		return this.sname;
	}
	//SETTER() FOR SNAME
	public void setsname(String sname)
	{
		this.sname=sname;
	}
	//GETTER() FOR STD
	public int getstd()
	{
		return this.std;
	}
	//GETTER() FOR SEC
	public char getsec()
	{
		return this.sec;
	}
	//GETTER() FOR PERC
	public String getperc(int sid)
	{
		if(this.sid==sid)
			return "Percentage:"+this.perc;
		else 
			return "Wrong sid";
			
	}
   
}
