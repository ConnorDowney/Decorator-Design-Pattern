/**
 * A Vehicle
 * @author Connor Downey
 */
public abstract class Vehicle {
    
    protected String description;

    /**
     * Returns the description as a String
     * @return a string of the description of the Vehicle
     */
    public String toString()
    {
        return description;
    }

    /**
     * Gets the cost of the vehicle
     * @return the cost
     */
    public abstract double getCost();
}
