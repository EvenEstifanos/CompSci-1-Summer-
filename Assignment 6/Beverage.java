import java.lang.Object;

public abstract class Beverage extends Object
{
   
	private String bevName;
	private  Type type;
	private Size size;
	private final double basePrice = 2.0;
	private final double sizePrice = 1.0;
	
	
	public Beverage (String bevName, Type type, Size size)
	{
		this.bevName = bevName;
		this.type = type;
		this.size = size;
	}
	
	public double getBasePrice()
	{
		return basePrice;
	}
	
	public Type getType()
	{
		return type;
	}
	
	public String getBevName()
	{
		return bevName;
	}
	
	public Size getSize()
	{
		return size;
	}
	
	public double addSizePrice()
	{
		if(size == size.MEDIUM)
			return sizePrice + basePrice;
		
		else if (size == size.LARGE)
			return sizePrice + sizePrice + basePrice;
		
		else
			return basePrice;
		
	}
	
	public boolean equals(Beverage anotherBev)
	{
		if(anotherBev.bevName.equals(bevName) && anotherBev.size== size && anotherBev.type == type)
		{
			return true;
		}
		
		else
			return false;
	}
	
	
	public abstract double calcPrice();
	
	public String toString()
	{
		return bevName + "," + size;
	}
	
}
