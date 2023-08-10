import static org.junit.Assert.*;
import org.junit.*;

public class TypeTestStudent
{

    Type alcohol, coffee, smoothie;

    @Before
    public void setUp() 
    {
        alcohol = Type.ALCOHOL;
        coffee = Type.COFFEE;
        smoothie = Type.SMOOTHIE;
    }

    @After
    public void tearDown() 
    {
        alcohol = null;
        coffee = null;
        smoothie = null;
    }

    @Test
    public void testValueOf() 
    {
        assertEquals(alcohol, Type.valueOF("ALCOHOL"));
        assertEquals(coffee, Type.valueOF("COFFEE"));
        assertEquals(smoothie, Type.valueOF("SMOOTHIE"));
    }

    @Test
    public void testValue() 
    {
        Type[] allTypes = Type.value();
        assertNotNull(allTypes);
        assertEquals(3, allTypes.length);
        assertEquals(alcohol, allTypes[0]);
        assertEquals(coffee, allTypes[1]);
        assertEquals(smoothie, allTypes[2]);
    }
	
}
