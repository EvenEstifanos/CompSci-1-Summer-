
import static org.junit.Assert.*;
import org.junit.*;

public class AlcoholTestStudent 

{

	Alcohol one, two, three, four;
	
	@Before
	public void setUp() throws Exception
	{
		one = new Alcohol ("Vodka",Size.LARGE,true);
		two = new Alcohol ("Wine",Size.MEDIUM,false);
		three = new Alcohol ("beer",Size.SMALL,true);
		four = new Alcohol ("Liquor",Size.LARGE,false);
	}
	
	@After
	public void tearDown( ) throws Exception
	{
		one = two = three = four = null;
	}
	

	@Test
	public void calcPrice()
	{
		assertEquals(4.6, one.calcPrice(),0.1);
		assertEquals(3.0, two.calcPrice(),0.1);
		assertEquals(2.6, three.calcPrice(),0.1);
		assertEquals(4.0, four.calcPrice(),0.1);
	}
	

	@Test
	public void equals()
	{
		Alcohol five = new Alcohol("Liquor",Size.LARGE,false);
		Alcohol six = new Alcohol("Tequilla",Size.MEDIUM,true);
		Alcohol seven = new Alcohol("Liquor",Size.LARGE,true);
		
		assertTrue(five.equals(four));
		assertFalse(six.equals(one));
		assertFalse(seven.equals(four));
	}
	
	@Test
	public void isWeekend()
	{
		assertTrue(one.isWeekend());
		assertFalse(two.isWeekend());
		assertTrue(three.isWeekend());
		assertFalse(four.isWeekend());
		
	
	}
	
	@Test
	public void testToString()
	{
		assertEquals("Vodka,LARGE, true, 4.6", one.toString());
		assertEquals("Wine,MEDIUM, false, 3.0", two.toString());
		assertEquals("beer,SMALL, true, 2.6", three.toString());
		assertEquals("Liquor,LARGE, false, 4.0", four.toString());
		
	}

}
