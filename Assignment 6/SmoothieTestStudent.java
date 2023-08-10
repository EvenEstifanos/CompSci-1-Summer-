import static org.junit.Assert.*;
import org.junit.*; 


public class SmoothieTestStudent 
{

	Smoothie one, two, three, four;
	
	
	@Before
	public void setUp() throws Exception
	{
		one = new Smoothie("Banana", Size.SMALL,1, false );
		two = new Smoothie("Special", Size.MEDIUM,3, false );
		three = new Smoothie("Protein", Size.LARGE,2, true );
		four = new Smoothie("ALL", Size.LARGE,4, true );
		
	}
	
	@After
	public void tearDown() throws Exception
	{
		one=two=three=four=null;
	}
	
	@Test
	public void testCalcPrice()
	{
		assertEquals(2.5, one.calcPrice(),0.1);
		assertEquals(4.5, two.calcPrice(),0.1);
		assertEquals(6.5, three.calcPrice(),0.1);
		assertEquals(7.5, four.calcPrice(),0.1);
		
	}
	
	@Test
	public void testEquals()
	{
		Smoothie five  = new Smoothie("Banana", Size.SMALL,1, false );
		Smoothie six  = new Smoothie("Banana", Size.MEDIUM,5, true );
		
		assertTrue(five.equals(one));
		assertFalse(six.equals(one));
		assertFalse(six.equals(two));
		
	}
	
	@Test
	public void testGetAddProtein()
	{
		assertTrue(three.getAddProtein());
		assertTrue(four.getAddProtein());
		assertFalse(one.getAddProtein());
		assertFalse(two.getAddProtein());
		
	}
	
	@Test
	public void testGetNumOfFruits()
	{
		assertEquals(1, one.getNumOfFruits());
		assertEquals(3, two.getNumOfFruits());
		assertEquals(2, three.getNumOfFruits());
		assertEquals(4, four.getNumOfFruits());
		
	}


	@Test
	public void testToString()
	{
		
		assertEquals("Banana,SMALL, 1, false, 2.5", one.toString());
		assertEquals("Special,MEDIUM, 3, false, 4.5", two.toString());
		assertEquals("Protein,LARGE, 2, true, 6.5", three.toString());
		assertEquals("ALL,LARGE, 4, true, 7.5", four.toString());
		
	}
	


}
