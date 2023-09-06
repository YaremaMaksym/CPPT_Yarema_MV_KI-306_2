package ki306.yarema.lab3.models;

/**
 * A class representing a filter used in a gas mask and allowing various operations with it.
 * The filter has a type and an effectiveness state.
 *
 * @author Yarema Maksym
 * @version 1.0
 * @since version 1.0
 */
public class Filter {
    private final String type;
    private boolean isEffective;

    /**
     * Constructor for creating a filter with default values.
     * Sets the filter type to "A2B2E2K2" and initializes it as effective.
     */
    public Filter() {
        type = "A2B2E2K2";
        isEffective = true;
    }

    /**
     * Constructor for creating a filter with a specified type.
     * @param type The type of the filter.
     */
    public Filter(String type) {
        this.type = type;
        isEffective = true;
    }

    /**
     * Make the filter ineffective.
     */
    public void makeIneffective() {
        isEffective = false;
    }

    /**
     * Check if the filter is effective.
     * @return true if the filter is effective, false otherwise.
     */
    public boolean isEffective() {
        return isEffective;
    }

    /**
     * Get the type of the filter.
     * @return The type of the filter.
     */
    public String getType() {
        return type;
    }
}