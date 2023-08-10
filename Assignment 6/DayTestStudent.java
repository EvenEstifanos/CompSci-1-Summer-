import static org.junit.Assert.*;
import org.junit.*;

public class DayTestStudent 
{
	
	Day one,three,five;
	
	@Before
	public void setUp() throws Exception
	{
		Day one = Day.SUNDAY;
		Day three = Day.TUESDAY;
		Day five = Day.THURSDAY;
	}
	
	@After
	public void tearDown() throws Exception
	{
		one=three=five = null;
	}
	
	@Test
	public void testValueOf()
	{
		assertEquals(Day.SUNDAY, Day.valueOF("SUNDAY"));
		assertEquals(Day.TUESDAY, Day.valueOF("TUESDAY"));
		assertEquals(Day.THURSDAY, Day.valueOF("THURSDAY"));
		
	}
	
	@Test
	public void testValue()
	{
		Day[] allDays = Day.value();
        assertNotNull(allDays);
        assertEquals(7, allDays.length);
        assertEquals(Day.SUNDAY, allDays[0]);
        assertEquals(Day.MONDAY, allDays[1]);
        assertEquals(Day.TUESDAY, allDays[2]);
        assertEquals(Day.WEDNESDAY, allDays[3]);
        assertEquals(Day.THURSDAY, allDays[4]);
        assertEquals(Day.FRIDAY, allDays[5]);
        assertEquals(Day.SATURDAY, allDays[6]);
    }

}
