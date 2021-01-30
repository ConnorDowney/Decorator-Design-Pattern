/**
 * Rims
 * @author Connor Downey
 */
public class Rims extends VehicleDecorator{
    
    private Vehicle vehicle;

    /**
     * Creates new Rims
     * @param vehicle a Vehicle is passed through to add rims to
     */
    public Rims(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    /**
     * Returns the description as a String
     * @return a string of the description of the Vehicle and the rims description
     */
    public String toString()
    {
        return vehicle.toString() + ", cool rims";
    }

    /**
     * Gets the cost of the vehicle plus rims
     * @return the cost
     */
    public double getCost()
    {
        return vehicle.getCost() + 200;
    }
}
