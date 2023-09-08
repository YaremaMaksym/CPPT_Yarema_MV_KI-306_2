package ki306.yarema.lab7;

public class Book implements Item {
    private String name;
    private double weight;

    public Book(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public int compareTo(Item item) {
        Double w = weight;
        return w.compareTo(item.getWeight());
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void use() {
        System.out.println("Reading a " + name);
    }

    @Override
    public void print() {
        System.out.println("Book: " + name + ", weights: " + weight);
    }
}
