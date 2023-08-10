
public class Smoothie extends Beverage
{

	private int numOfFruits;
	private boolean addProtein;
	
	public Smoothie(String bevName,Size size, int numOfFruits, boolean addProtein)
	{
		super(bevName,Type.SMOOTHIE,size);
		
		this.numOfFruits= numOfFruits;
		this.addProtein = addProtein;
	}
	
	public double calcPrice()
	{
		//The cost of adding protein is $1.50 and each additional fruit costs 50 cents.
		
        double price = super.addSizePrice();
		
		if(addProtein)
			price += 1.50;
			
		price += numOfFruits * 0.50;
		
		return price;
	}
	
	public boolean equals(Beverage anotherBev)
	{
		Smoothie one = (Smoothie) anotherBev;
		
		if(super.equals(anotherBev) && one.getNumOfFruits() == numOfFruits && addProtein == one.getAddProtein())
			return true;
		
		else
			return false;
	}
	
	public boolean getAddProtein()
	{
		return addProtein;
	}
	
	public int getNumOfFruits()
	{
		return numOfFruits;
	}
	
	public String toString()
	{
		return super.toString() +", " + numOfFruits + ", " + addProtein + ", " + calcPrice(); 
	}
}
