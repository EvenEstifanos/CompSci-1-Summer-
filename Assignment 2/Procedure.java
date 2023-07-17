/*
 * Procedure class represents a medical procedure with attributes such as procedure name, procedure date,
 * practitioner (surgeon), and cost.
 */
public class Procedure 
{
	public String procedureName;
	public String procedureDate;
	public String practitioner;
	public double cost;
	
	/*
     * Constructor - responsible for creating a Procedure object with the provided values.
     * It initializes the procedure's attributes with the given information.
     */
	public Procedure(String Name, String date, String surgeon, double charge)
	{
		procedureName = Name;
		procedureDate = date;
		practitioner = surgeon;
		cost = charge;
	}
	
	 /*
     * Below are Getter and Setter methods for the procedure's attributes.
     */

    // Getter for the procedure's name.
	public String getName()
	{
		return procedureName;
	}
	
	// Setter for the procedure's name.
	public void setName(String name)
	{
		procedureName = name;
	}
	
	// Getter for the procedure's date.
	public String getDate()
	{
		return procedureDate;
	}
	
	// Setter for the procedure's date.
	public void setDate(String date)
	{
		procedureDate = date;
	}
	
    // Getter for the procedure's practitioner.
	public String getPractitioner()
	{
		return practitioner;
	}
	
    // Setter for the procedure's practitioner.
	public void setPractitioner(String surgeon)
	{
		practitioner = surgeon;
	}
	
    // Getter for the procedure's cost.
	public double getCost()
	{
		return cost;
	}
	
    // Setter for the procedure's cost.
	public void setCost(double charges)
	{
		 cost = charges;
	}
	
}
