/**
 * Represents a Plot object.
 */
public class Plot {
    // Instance variables
    private int x;
    private int y;
    private int width;
    private int depth;

    /**
     * Creates a default Plot with width and depth of 1 and coordinates (0, 0).
     */
    public Plot() {
        x = 0;
        y = 0;
        width = 1;
        depth = 1;
    }

    /**
     * Creates a Plot using the given values.
     *
     * @param x     the x coordinate of the plot
     * @param y     the y coordinate of the plot
     * @param width the width coordinate of the plot
     * @param depth the depth coordinate of the plot
     */
    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }

    /**
     * Creates a new plot given another plot.
     *
     * @param otherPlot the plot to make a copy of
     */
    public Plot(Plot otherPlot) {
        x = otherPlot.x;
        y = otherPlot.y;
        width = otherPlot.width;
        depth = otherPlot.depth;
    }

    /**
     * Determines if the given plot instance is overlapped by the current plot.
     *
     * @param plot the plot to test against and check if overlaps
     * @return true if the two plots overlap, false otherwise
     */
    public boolean overlaps(Plot plot) {
        return (x < plot.x + plot.width) && (x + width > plot.x) &&
                (y < plot.y + plot.depth) && (y + depth > plot.y);
    }

    /**
     * Determines if the given plot is encompassed by (is contained by) this plot.
     * Note that the determination should be inclusive, in other words,
     * if an edge lies on the edge of the current plot, this is acceptable.
     *
     * @param plot the plot to test against and check if encompasses
     * @return true if the given plot is encompassed by this plot, false otherwise
     */
    public boolean encompasses(Plot plot) {
        return (x <= plot.x) && (x + width >= plot.x + plot.width) &&
                (y <= plot.y) && (y + depth >= plot.y + plot.depth);
    }

    /**
     * Gets the x coordinate of the plot.
     *
     * @return the x coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Gets the y coordinate of the plot.
     *
     * @return the y coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Gets the width of the plot.
     *
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Gets the depth of the plot.
     *
     * @return the depth
     */
    public int getDepth() {
        return depth;
    }

    /**
     * Represents a Plot object as a string in the format: x,y,width,depth.
     *
     * @return the string representation of a plot
     */
    @Override
    public String toString() {
        return x + "," + y + "," + width + "," + depth;
    }
}
