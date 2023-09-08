package ki306.yarema.lab7;

public class Main {
    public static void main(String[] args) {
        BedsideTable <? super Item> bsTable = new BedsideTable<>();
        bsTable.putItem(new Book("Atomic Habits", 1.852));
        bsTable.putItem(new Flashlight("Mobile flashlight" , 0.13));
        bsTable.putItem(new Book("The Catcher in the Rye" , 1.243));
        bsTable.putItem(new Flashlight("Endless light +Ultra" , 1.726));

        Item item = bsTable.getItem(2);
        item.print();

        item = bsTable.getItem(3);
        item.use();

        Item max = bsTable.getMax();
        System.out.println("\nThe heaviest item in bedside table is: ");
        max.print();
    }
}