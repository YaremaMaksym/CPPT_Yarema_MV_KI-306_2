package ki306.yarema.lab7;

public interface Item extends Comparable<Item> {
    public double getWeight();
    public void use();
    public void print();
}
