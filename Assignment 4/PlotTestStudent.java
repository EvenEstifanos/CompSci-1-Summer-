import static org.junit.Assert.*;
import org.junit.Test;

/**
 * This class represents student test cases for a Plot object.
 * 
 * @author Even Estifanos
 * @version 7/31/2023
 * 
 */
public class PlotTestStudent {

    @Test
    public void testOverlapsWithEncompassedPlot() {
        Plot plot1 = new Plot(2, 2, 6, 6);
        Plot plot2 = new Plot(3, 3, 4, 4);

        assertTrue(plot1.overlaps(plot2)); // plot2 is entirely inside plot1
    }

    @Test
    public void testOverlapsWithAdjacentPlot() {
        Plot plot1 = new Plot(2, 2, 6, 6);
        Plot plot3 = new Plot(8, 8, 5, 5);

        assertFalse(plot1.overlaps(plot3)); // plot3 is adjacent to plot1, should not overlap
    }

    @Test
    public void testOverlapsWithNonOverlappingPlot() {
        Plot plot1 = new Plot(2, 2, 6, 6);
        Plot plot4 = new Plot(10, 10, 4, 4);

        assertFalse(plot1.overlaps(plot4)); // plot4 does not overlap with plot1
    }

   

    @Test
    public void testToString() {
        Plot plot8 = new Plot(0, 0, 10, 5);

        assertEquals("0,0,10,5", plot8.toString());
    }
}
