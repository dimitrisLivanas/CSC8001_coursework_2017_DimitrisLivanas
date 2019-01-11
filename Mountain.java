
/**
 * "Mountain" class will store and retrieve information about the name and height(in meters)
 * of the mountain.
 * 
 * @author Dimitris Livanas
 * @version 131117 (13/11/2017)
 */
public class Mountain
{
    /**
     *instance variables for the mountain 
     */
    private int height;
    private String name;

    /**
     * Constructor for objects of class Mountain
     * This method contains the Attributes for the Mountain object, Name and Height.
     * @param mountainName - the name of the mountain
     * @param mountainHeight - the height of the mountain
     */
    public Mountain(int mountainHeight, String mountainName)
    {
        name = mountainName;
        height = mountainHeight;

    }

    /**
     * Method to return the "Name" Attribute of the Mountain Object.
     * @return - the name of the mountain
     */
    public String getName()
    {
        return name;
    }

    /**
     * Method to return the "Height" Attribute of the Mountain Object.
     * @return - the height of the mountain
     */
    public int getHeight()
    {
        return height;
    }

}
