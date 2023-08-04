/**
 * Represents a Property object.
 */
public class Property {
    // Instance variables
    private String propertyName;
    private String city;
    private double rentAmount;
    private String owner;
    private Plot plot;

    /**
     * Creates a new Property with default values.
     */
    public Property() 
    {
        propertyName = "";
        city = "";
        rentAmount = 0.0;
        owner = "";
        plot = new Plot();
    }

    /**
     * Creates a new Property object with given values and default plot.
     *
     * @param propertyName Property name
     * @param city         City where the property is located
     * @param rentAmount   Rent amount
     * @param owner        Owner's name
     */
    public Property(String propertyName, String city, double rentAmount, String owner) {
        this.propertyName = propertyName;
        this.city = city;
        this.rentAmount = rentAmount;
        this.owner = owner;
        this.plot = new Plot();
    }

    /**
     * Creates a new Property object with given values and plot.
     *
     * @param propertyName Property name
     * @param city         City where the property is located
     * @param rentAmount   Rent amount
     * @param owner        Owner's name
     * @param x            X coordinate of the plot
     * @param y            Y coordinate of the plot
     * @param width        Width of the plot
     * @param depth        Depth of the plot
     */
    public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
        this.propertyName = propertyName;
        this.city = city;
        this.rentAmount = rentAmount;
        this.owner = owner;
        this.plot = new Plot(x, y, width, depth);
    }

    /**
     * Creates a new copy of the given property object.
     *
     * @param otherProperty Property object to make a copy of
     */
    public Property(Property otherProperty) {
        this.propertyName = otherProperty.propertyName;
        this.city = otherProperty.city;
        this.rentAmount = otherProperty.rentAmount;
        this.owner = otherProperty.owner;
        this.plot = new Plot(otherProperty.plot);
    }

    /**
     * Gets the plot of the property.
     *
     * @return The plot of the property
     */
    public Plot getPlot() {
        return plot;
    }

    /**
     * Gets the property name.
     *
     * @return The property name
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Gets the city where the property is located.
     *
     * @return The city where the property is located
     */
    public String getCity() {
        return city;
    }

    /**
     * Gets the rent amount of the property.
     *
     * @return The rent amount of the property
     */
    public double getRentAmount() {
        return rentAmount;
    }

    /**
     * Gets the owner's name of the property.
     *
     * @return The owner's name of the property
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Represents the Property object as a string in the format: propertyName,city,owner,rentAmount.
     *
     * @return The string representation of the Property object
     */
    @Override
    public String toString() {
        return propertyName + "," + city + "," + owner + "," + rentAmount;
    }
}
