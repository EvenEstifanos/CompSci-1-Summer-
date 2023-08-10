import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OrderTestStudent
{

    private Order orderOne, orderTwo;

    @Before
    public void setUp() throws Exception {
        orderOne = new Order(10, Day.TUESDAY, new Customer("Alice", 30));
        orderTwo = new Order(15, Day.SUNDAY, new Customer("Bob", 28));
    }

    @After
    public void tearDown() throws Exception {
        orderOne = orderTwo = null;
    }

    @Test
    public void testAddNewBeverage() 
    {
        orderOne.addNewBeverage("Espresso", Size.SMALL, true, false);
        assertEquals(1, orderOne.getTotalItems());
        orderOne.addNewBeverage("Mojito", Size.MEDIUM);
        assertEquals(2, orderOne.getTotalItems());
    }

    @Test
    public void testCalcOrderTotal() 
    {
        orderOne.addNewBeverage("Espresso", Size.MEDIUM, false, false);
        orderOne.addNewBeverage("Mocha", Size.LARGE);
        assertEquals(7.0, orderOne.calcOrderTotal(), 0.01);

        orderTwo.addNewBeverage("Margarita", Size.SMALL);
        orderTwo.addNewBeverage("Detox", Size.MEDIUM, 3, true);
        assertEquals(8.6, orderTwo.calcOrderTotal(), 0.01);
    }

    @Test
    public void testGetBeverage() {
        orderOne.addNewBeverage("Espresso", Size.SMALL, false, false);
        orderOne.addNewBeverage("Mocha", Size.MEDIUM);
        assertEquals("Espresso", orderOne.getBeverage(0).getBevName());
        assertEquals(Size.MEDIUM, orderOne.getBeverage(1).getSize());
    }

}
