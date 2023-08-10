
import java.util.*;

public class Order implements OrderInterface
{
	private int orderTime;
	private Day orderDay;
	private Customer cust;
	private int orderNo;
	
	private ArrayList <Beverage> list = new ArrayList <> ();
	

	public Order(int orderTime, Day orderDay, Customer cust)
	{
		this.cust = new Customer(cust);
		
		this.orderTime = orderTime;
		this.orderDay = orderDay;
	}
	
	public void addNewBeverage(String bevName, Size size)
	{

		Alcohol one = new Alcohol (bevName,size, (orderDay.equals(Day.SATURDAY) || orderDay.equals(Day.SUNDAY)) );
		list.add(one);
		
	}
	
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup)
	{
		Coffee one = new Coffee(bevName,size,extraShot, extraSyrup);
		list.add(one);
	}
	
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein)
	{
		Smoothie one = new Smoothie(bevName,size,numOfFruits,addProtein);
		list.add(one);
	}
	
	public double calcOrderTotal()
	{
		double total = 0; 
		
		for(Beverage loop: list)
		{
			total += loop.calcPrice();
		}
		
		return total;
	}
	
	public int compareTo(Order anotherOrder)
	{
		if(anotherOrder.getOrderNo() == this.orderNo)
			return 0;
		else if(anotherOrder.getOrderNo() < this.orderNo)
			return 1;
		else
			return -1;
	}
	
	public int findNumOfBeveType(Type type)
	{
		int count =0;
		
		for(Beverage loop: list)
		{
			if(loop.getType() == type)
				count++;
		}
		
		return count;
		
	}
	
	public int generateOrder()
	{
		Random one = new Random ();
		
		return one.nextInt(90000 - 10000 +1) + 10000;
		
	}
	
	public Beverage getBeverage(int itemNo)
	{
		return list.get(itemNo);
	}
	
	public Customer getCustomer()
	{
		return cust;
	}
	
	public Day getOrderDay()
	{
		return orderDay;
	}
	
	public int getOrderNo()
	{
		return orderNo;
	}
	
	public int getOrderTime()
	{
		return orderTime;
	}
	
	public int getTotalItems()
	{
		
			return list.size();
		
	}
	
	public boolean isWeekend()
	{
		if(orderDay.equals(Day.SATURDAY) || orderDay.equals(Day.SUNDAY))
			return true;
		else
			return false;
	}
	
	public String toString()
	{
		return orderNo + orderTime + " " + orderDay + cust.getName() + cust.getAge()+ list;
	}

}
