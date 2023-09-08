package ki306.yarema.lab7;

import java.util.ArrayList;

public class BedsideTable <T extends Item> {

    private ArrayList<T> array;

    public BedsideTable() {
        array = new ArrayList<T>();
    }

    public void putItem(T item) {
        array.add(item);
        System.out.print("Item added: ");
        item.print();
    }

    public T getItem(int i) {
       return array.get(i);
    }

    public T getMax() {
        if (!array.isEmpty()){
            T max = array.get(0);
            for (int i = 1; i <array.size(); i++) {
                if (array.get(i).compareTo(max) > 0){
                    max = array.get(i);
                }
            }
            return max;
        }
        return null;
    }

    public void useItem(int i){
        array.get(i).use();
    }

}
