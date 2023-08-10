
public class Coffee extends Beverage
{

	private boolean extraShot;
	private boolean extraSyrup;
	
	public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup)
	{
		super(bevName,Type.COFFEE,size);
		
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}
	
	
	public double calcPrice()
	{
		double price = super.addSizePrice();
		
		if(extraShot)
			price+=0.50;
		
		if(extraSyrup)
			price +=0.50;
		
		return price;
	}
	
	
	public boolean equals(Beverage anotherBev)
	{
		Coffee other = (Coffee) anotherBev;
		
		if(super.equals(anotherBev) && (this.extraShot == other.getExtraShot()) && extraSyrup == other.getExtraSyrup())
			return true;
		
		else
			return false;
	}
	
	public boolean getExtraShot()
	{
		return extraShot;
	}
	
	public boolean getExtraSyrup()
	{
		return extraSyrup;
	}
	
	public String toString()
	{
		return super.toString() +", " + extraShot +", " + extraSyrup + ", " + calcPrice();
		
	}
}
