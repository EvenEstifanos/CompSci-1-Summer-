
import java.lang.Object;

public class Alcohol extends Beverage
{
	
	private boolean isWeekend;
	

	public Alcohol(String bevName, Size size, boolean isWeekend)
	{
		super(bevName,Type.ALCOHOL,size);
		
		this.isWeekend = isWeekend;
		
	}
	
	public double calcPrice()
	{
		double price = super.addSizePrice();
		
		if(isWeekend)
			price += 0.60;
		
		return price;
	}
	
	@Override
	public boolean equals(Beverage anotherbev)
	{
		Alcohol other = (Alcohol) anotherbev;
		
		if(super.equals(anotherbev) && other.isWeekend() == isWeekend)
			return true;
	
		else
			return false;
		
	}
	
	public boolean isWeekend()
	{
		
		if(isWeekend)
			return true;
		
		else
			return false;
	}
	
	public String toString()
	{
		return super.toString() + ", " + isWeekend + ", " + calcPrice();
	}
}
