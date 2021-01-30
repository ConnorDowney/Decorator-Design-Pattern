/**
 * Sound System
 * @author Connor Downey
 */
public class SoundSystem extends VehicleDecorator{
    
    private Vehicle vehicle;

    /**
     * Creates new SoundSystem
     * @param vehicle a Vehicle is passed through to add a sound system to
     */
    public SoundSystem(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    /**
     * Returns the description as a String
     * @return a string of the description of the Vehicle and the sound description
     */
    public String toString()
    {
        return vehicle.toString() + ", awesome sound";
    }

    /**
     * Gets the cost of the vehicle plus sound
     * @return the cost
     */
    public double getCost()
    {
        return vehicle.getCost() + 350;
    }
}
