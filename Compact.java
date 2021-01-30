/**
 * A Compact Car
 * @author Connor Downey
 */
public class Compact extends Vehicle{
    
    /**
     * Creates a Compact Car
     */
    public Compact()
    {
        this.description = "Compact";

    }

    /**
     * Gets the cost of the Compact
     * @return the cost
     */
    public double getCost()
    {
        return 15000;
    }
}
