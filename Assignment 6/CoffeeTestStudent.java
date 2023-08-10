import org.junit.*;
import static org.junit.Assert.*;

public class CoffeeTestStudent
{

	Coffee one, two, three;
	
	@Before
	public void setUp() throws Exception
	{
		one = new Coffee("Espresso", Size.SMALL, true,true);
		two = new Coffee("Latte", Size.MEDIUM, true,false);
		three = new Coffee("Brew", Size.LARGE, false,false);
	}
	
	@After
	public void tearDown() throws Exception
	{
		one=two=three=null;
	}

	@Test
	public void testCalcPrice() 
	{
		assertEquals(3.0 ,one.calcPrice(),0.1);
		assertEquals(3.5 ,two.calcPrice(),0.1);
		assertEquals(4.0 ,three.calcPrice(),0.1);
		
	}
	
	@Test
	public void testEquals()
	{
		Coffee four = new Coffee("Espresso", Size.SMALL, true,true);
		Coffee five = new Coffee("Espresso", Size.MEDIUM, true,true);
		
		assertTrue(four.equals(one));
		assertFalse(five.equals(one));
		assertFalse(five.equals(three));
		
	}
	

	@Test
	public void testGetExtraShot()
	{
		assertTrue(one.getExtraShot());
		assertTrue(two.getExtraShot());
		assertFalse(three.getExtraShot());
		
	}

	@Test
	public void testGetExtraSyrup()
	{
		assertTrue(one.getExtraSyrup());
		assertFalse(two.getExtraSyrup());
		assertFalse(three.getExtraSyrup());
	}

	@Test
	public void testToString()
	{
		assertEquals("Espresso,SMALL, true, true, 3.0", one.toString());
		assertEquals("Latte,MEDIUM, true, false, 3.5", two.toString());
		assertEquals("Brew,LARGE, false, false, 4.0", three.toString());
	}
		

}
