package ki306.yarema.lab7;

/**
 * The Book class represents a book item that implements the Item interface.
 * It has a name and a weight, and it can be used for reading.
 *
 * @author Yarema Maksym
 * @version 1.0
 */
public class Book implements Item {
    private String name;
    private double weight;

    /**
     * Constructs a new Book object with the specified name and weight.
     *
     * @param name   The name of the book.
     * @param weight The weight of the book as a double value.
     */
    public Book(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    /**
     * Compares this book's weight to the weight of another item that implements the Item interface.
     *
     * @param item The item to compare to.
     * @return A negative integer if this book is lighter, a positive integer if
     *         it's heavier, or 0 if they have the same weight.
     */
    public int compareTo(Item item) {
        Double w = weight;
        return w.compareTo(item.getWeight());
    }

    /**
     * Get the weight of the book.
     *
     * @return The weight of the book as a double value.
     */
    @Override
    public double getWeight() {
        return weight;
    }

    /**
     * Use the book for reading.
     */
    @Override
    public void use() {
        System.out.println("Reading a " + name);
    }

    /**
     * Print information about the book.
     */
    @Override
    public void print() {
        System.out.println("Book: " + name + ", weights: " + weight);
    }
}
