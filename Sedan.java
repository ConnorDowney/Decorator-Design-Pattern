/**
 * A Sedan
 * @author Connor Downey
 */
public class Sedan extends Vehicle{
    
    /**
     * Creates a new Sedan
     */
    public Sedan()
    {
        this.description = "Sedan";
    }

    /**
     * Gets the cost of the Sedan
     * @return the cost
     */
    public double getCost()
    {
        return 20000;
    }
}
