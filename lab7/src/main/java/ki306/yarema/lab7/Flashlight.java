package ki306.yarema.lab7;

public class Flashlight implements Item{
    private String name;
    private double weight;

    public Flashlight(String name, double weight) {
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
        System.out.println("Using " + name + " flashlight");
    }

    @Override
    public void print() {
        System.out.println("Flashlight: " + name + ", weights: " + weight);
    }


}
