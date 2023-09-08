package ki306.yarema.lab7;

/**
 * The Flashlight class represents a flashlight item that implements the Item interface.
 * It has a name and a weight, and it can be used as a flashlight.
 *
 * @author Yarema Maksym
 * @version 1.0
 */
public class Flashlight implements Item {
    private String name;
    private double weight;

    /**
     * Constructs a new Flashlight object with the specified name and weight.
     *
     * @param name   The name of the flashlight.
     * @param weight The weight of the flashlight as a double value.
     */
    public Flashlight(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    /**
     * Compares this flashlight's weight to the weight of another item that implements the Item interface.
     *
     * @param item The item to compare to.
     * @return A negative integer if this flashlight is lighter, a positive integer if
     *         it's heavier, or 0 if they have the same weight.
     */
    public int compareTo(Item item) {
        Double w = weight;
        return w.compareTo(item.getWeight());
    }

    /**
     * Get the weight of the flashlight.
     *
     * @return The weight of the flashlight as a double value.
     */
    @Override
    public double getWeight() {
        return weight;
    }

    /**
     * Use the flashlight.
     */
    @Override
    public void use() {
        System.out.println("Using " + name + " flashlight");
    }

    /**
     * Print information about the flashlight.
     */
    @Override
    public void print() {
        System.out.println("Flashlight: " + name + ", weights: " + weight);
    }
}

