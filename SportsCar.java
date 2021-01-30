/**
 * A SportsCar
 * @author Connor Downey
 */
public class SportsCar extends Vehicle{
    
    /**
     * Creates a new SportsCar
     */
    public SportsCar()
    {
        this.description = "Sports Car";
    }

    /**
     * Gets the cost of the SportsCar
     * @return the cost
     */
    public double getCost()
    {
        return 30000;
    }
}
