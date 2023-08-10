

import static org.junit.Assert.*;

import org.junit.*;

public class BevShopTestStudent 
{
	
	BevShop one;
	
	@Before
	public void setUp() throws Exception
	{
		one = new BevShop();
		
		one.startNewOrder(12, Day.MONDAY, "Kevin", 25);
		
		one.processAlcoholOrder("Tequilla", Size.LARGE);
		one.processAlcoholOrder("Marinara", Size.MEDIUM);
		
		one.processCoffeeOrder("Latte", Size.SMALL, true, true);
		one.processCoffeeOrder("Espresso", Size.MEDIUM, true, false);
		one.processCoffeeOrder("Latte", Size.LARGE, false, false);
		
		one.processSmoothieOrder("Banana", Size.SMALL,1,true);
		one.processSmoothieOrder("Special", Size.MEDIUM, 2, false);
		one.processSmoothieOrder("Apple", Size.LARGE, 3, false);
		
	}
		
	
	@After
	public void tearDown() throws Exception
	{
		one = null;
	}
	

	
	@Test
	public void testIsValidTime()
	{
		assertTrue(one.isValidTime(12));
		assertTrue(one.isValidTime(22));
		
		assertFalse(one.isValidTime(5));
		assertFalse(one.isValidTime(24));
		
	}
	
	@Test
	public void testGetMinAgeForAlcohol()
	{
		assertEquals(21, one.getMinAgeForAlcohol());
	}
	
	@Test
	public void testGetMaxOrderForAlcohol()
	{
		assertEquals(3, one.getMaxOrderForAlcohol());
	}
	
	@Test
	public void testGetMaxNumOfFruits()
	{
		assertEquals(5, one.getMaxNumOfFruits());
	}
	
	
	@Test
	public void testIsMaxFruit()
	{
		assertTrue(one.isMaxFruit(7));
		assertTrue(one.isMaxFruit(10));
		assertFalse(one.isMaxFruit(3));
		
	}
	
	
	@Test
	public void isValidAge()
	{
		assertTrue(one.isValidAge(24));
		assertTrue(one.isValidAge(21));
		assertFalse(one.isValidAge(18));
	}
		
	
	@Test
	public void testProcessCoffeeOrder()
	{
		assertEquals(3, one.getCurrentOrder().findNumOfBeveType(Type.COFFEE));
	}
	

	@Test
	public void TestGetNumOfAlcoholDrink()
	{
		assertEquals(2,one.getNumOfAlcoholDrink());
	}
	
	
	@Test
	public void testIsEligibleForMore()
	{
		
		assertTrue(one.isEligibleForMore());
		
		one.processAlcoholOrder("Vodka", Size.LARGE);
		one.processAlcoholOrder("Secret Juice", Size.LARGE);
		
		
		assertFalse(one.isEligibleForMore());
		
	}

	
	@Test
	public void testFindOrder()
	{
		assertEquals(0,one.findOrder(0));
		assertEquals(-1, one.findOrder(2));
	}

	@Test
	public void testTotalOrderPrice()
	{
		assertEquals(31.0, one.totalOrderPrice(0),0.1);
		
	}
	
	@Test
	public void testTotalMonthlySale()
	{
		assertEquals(31.0, one.totalMonthlySale(),0.1);
	}

	
	@Test
	public void testTotalNumOfMonthlyOrders()
	{
		assertEquals(1,one.totalNumOfMonthlyOrders(),0.1);
	}
	
}

