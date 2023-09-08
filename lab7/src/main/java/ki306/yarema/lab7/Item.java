package ki306.yarema.lab7;

/**
 * The Item interface represents items that can be used and have weight.
 * Classes that implement this interface should provide implementations
 * for the methods declared here.
 *
 * @author Yarema Maksym
 * @version 1.0
 */
public interface Item extends Comparable<Item> {
    /**
     * Get the weight of the item.
     *
     * @return The weight of the item as a double value.
     */
    public double getWeight();

    /**
     * Perform an action with the item.
     */
    public void use();

    /**
     * Print information about the item.
     */
    public void print();
}
