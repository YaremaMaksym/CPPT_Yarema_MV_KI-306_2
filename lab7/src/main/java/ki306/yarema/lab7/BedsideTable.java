package ki306.yarema.lab7;

import java.util.ArrayList;

/**
 * The BedsideTable class represents a container for items of a specific type that implement the Item interface.
 * It allows adding, retrieving, finding the maximum-weight item, and using items.
 *
 * @param <T> The type of items that can be stored in the bedside table, which must implement the Item interface.
 *
 * @author Yarema Maksym
 * @version 1.0
 */
public class BedsideTable<T extends Item> {

    private ArrayList<T> array;

    /**
     * Constructs a new BedsideTable object.
     * Initializes an empty array to store items.
     */
    public BedsideTable() {
        array = new ArrayList<T>();
    }

    /**
     * Adds an item to the bedside table and prints a message indicating the addition.
     *
     * @param item The item to add to the bedside table.
     */
    public void putItem(T item) {
        array.add(item);
        System.out.print("Item added: ");
        item.print();
    }

    /**
     * Retrieves an item from the bedside table by its index.
     *
     * @param i The index of the item to retrieve.
     * @return The item at the specified index, or null if the index is out of bounds.
     */
    public T getItem(int i) {
        return array.get(i);
    }

    /**
     * Finds and returns the item with the maximum weight in the bedside table.
     *
     * @return The item with the maximum weight, or null if the bedside table is empty.
     */
    public T getMax() {
        if (!array.isEmpty()) {
            T max = array.get(0);
            for (int i = 1; i < array.size(); i++) {
                if (array.get(i).compareTo(max) > 0) {
                    max = array.get(i);
                }
            }
            return max;
        }
        return null;
    }

    /**
     * Uses an item in the bedside table by its index.
     *
     * @param i The index of the item to use.
     */
    public void useItem(int i) {
        array.get(i).use();
    }
}
