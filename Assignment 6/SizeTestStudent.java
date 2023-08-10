
import static org.junit.Assert.*;
import org.junit.*;


public class SizeTestStudent 
{

	Size one,two,three;
	
	@Before
	public void setUp() throws Exception
	{
		Size one = Size.SMALL;
		Size two = Size.MEDIUM;
		Size three = Size.LARGE;
	}
	
	@After
	public void tearDown() throws Exception
	{
		one=two=three = null;
	}
	
	  @Test
	    public void testValueOf() 
	  {
	        assertEquals(Size.LARGE, Size.valueOF("LARGE"));
	        assertEquals(Size.MEDIUM, Size.valueOF("MEDIUM"));
	        assertEquals(Size.SMALL, Size.valueOF("SMALL"));
	    }

	    @Test
	    public void testValue() {
	        Size[] allSizes = Size.value();
	        assertNotNull(allSizes);
	        assertEquals(3, allSizes.length);
	        assertEquals(Size.LARGE, allSizes[0]);
	        assertEquals(Size.MEDIUM, allSizes[1]);
	        assertEquals(Size.SMALL, allSizes[2]);
	    }

}
