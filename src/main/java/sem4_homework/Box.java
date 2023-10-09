package sem4_homework;

import java.util.ArrayList;

public class Box<T extends Fruit> implements Comparable<Box<T>> {


    //region methods

    /**
     * add a new fruit
     * @param fruit a new fruit
     */
    public void addFruits(T fruit) {
        boxArrayList.add(fruit);
        this.fruit = fruit;
    }

    /**
     * add new fruits
     * @param fruit new fruit
     * @param amount number of fruits
     */
    public void addFruits(T fruit, int amount) {
        this.fruit = fruit;
        for (int i = 0; i < amount; i++) {
            addFruits(this.fruit);
        }
    }

    public double getWeight() {
        return boxArrayList.size() * fruit.getWeight();
    }


    public boolean compare(Box box) {
        return compareTo(box) == 0;
    }

    @Override
    public int compareTo(Box o) {
        return Double.compare(this.getWeight(), o.getWeight());
    }

    public void sprinkleFruitsTo(Box<T> box) {
        box.boxArrayList.addAll(this.boxArrayList);
        this.boxArrayList = new ArrayList<>();
    }

    //endregion

    //region Constructor
    /**
     * create box
     */
    public Box() {
        boxArrayList = new ArrayList<>();
    }
    //endregion

    //region Поля
    T fruit;

    protected ArrayList<T> boxArrayList;

    //endregion
}
