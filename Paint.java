/**
 * Car Paint
 * @author Connor Downey
 */
public class Paint extends VehicleDecorator{
    
    private Vehicle vehicle;

    /**
     * Creates new Paint
     * @param vehicle a Vehicle is passed through to add paint to
     */
    public Paint(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    /**
     * Returns the description as a String
     * @return a string of the description of the Vehicle with the paint description
     */
    public String toString()
    {
        return vehicle.toString() + ", fancy paint";
    }

    /**
     * Gets the cost of the vehicle plus paint
     * @return the cost
     */
    public double getCost()
    {
        return vehicle.getCost() + 150;
    }
}
